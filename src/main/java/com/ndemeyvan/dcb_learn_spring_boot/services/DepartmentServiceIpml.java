package com.ndemeyvan.dcb_learn_spring_boot.services;

import com.ndemeyvan.dcb_learn_spring_boot.entities.DepartmentEntity;
import com.ndemeyvan.dcb_learn_spring_boot.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceIpml implements  DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    @Override
    public List<DepartmentEntity> getListOfDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public DepartmentEntity getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public void deleteDepartmentById(Long id) {
         departmentRepository.deleteById(id);
    }

    @Override
    public DepartmentEntity updateDepartment(Long id, DepartmentEntity departmentEntity) {
        DepartmentEntity dbDepartment = departmentRepository.findById(id).get();

        if(Objects.nonNull(departmentEntity.getDepartmentName())&& !"".equalsIgnoreCase(departmentEntity.getDepartmentName())){
                    dbDepartment.setDepartmentName(departmentEntity.getDepartmentName());
        }

        if(Objects.nonNull(departmentEntity.getDepartmentAddress())&& !"".equalsIgnoreCase(departmentEntity.getDepartmentAddress())){
                dbDepartment.setDepartmentAddress(departmentEntity.getDepartmentAddress());
        }

        if(Objects.nonNull(departmentEntity.getDepartmentCode())&& !"".equalsIgnoreCase(departmentEntity.getDepartmentCode())){
                dbDepartment.setDepartmentCode(departmentEntity.getDepartmentCode());
        }

        return departmentRepository.save(dbDepartment);

    }

    @Override
    public DepartmentEntity getDepartmentByName(String name) {
        return departmentRepository.findByDepartmentName(name);
    }


}
