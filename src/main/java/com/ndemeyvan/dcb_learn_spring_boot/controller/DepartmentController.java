package com.ndemeyvan.dcb_learn_spring_boot.controller;

import com.ndemeyvan.dcb_learn_spring_boot.entities.DepartmentEntity;
import com.ndemeyvan.dcb_learn_spring_boot.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public DepartmentEntity saveDepartment(@RequestBody  DepartmentEntity departmentEntity){
        return departmentService.saveDepartment(departmentEntity);
    }
    @GetMapping("/departments")
    public List<DepartmentEntity> getListOfDepartment(){
            return departmentService.getListOfDepartment();
    }

    @GetMapping("/departments/{id}")
    public DepartmentEntity getDepartmentById(@PathVariable("id") Long id){
        return departmentService.getDepartmentById(id);
    }
    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long id){
         departmentService.deleteDepartmentById(id);
        return "Departement supprime avec success";
    }

    @PutMapping("/departments/{id}")
    public DepartmentEntity  updateDepartment(@PathVariable("id") Long id,@RequestBody  DepartmentEntity departmentEntity){
        return departmentService.updateDepartment(id,departmentEntity);
    }
    @GetMapping("/departments/name/{name}")
    public DepartmentEntity getDepartmentByName(@PathVariable("name") String name){
        return departmentService.getDepartmentByName(name);
    }



}
