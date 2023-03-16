package com.ndemeyvan.dcb_learn_spring_boot.controller;

import com.ndemeyvan.dcb_learn_spring_boot.entities.DepartmentEntity;
import com.ndemeyvan.dcb_learn_spring_boot.services.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    private Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public DepartmentEntity saveDepartment(@Valid @RequestBody  DepartmentEntity departmentEntity){
        LOGGER.info("### This is inside save department controller");
        return departmentService.saveDepartment(departmentEntity);
    }
    @GetMapping("/departments")
    public List<DepartmentEntity> getListOfDepartment(){
        LOGGER.info("### This is inside get list of department controller");
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
