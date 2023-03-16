package com.ndemeyvan.dcb_learn_spring_boot.services;

import com.ndemeyvan.dcb_learn_spring_boot.entities.DepartmentEntity;

import java.util.List;

public interface DepartmentService {
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity);

    public List<DepartmentEntity> getListOfDepartment();

   public DepartmentEntity getDepartmentById(Long id);

    public void deleteDepartmentById(Long id);

    public DepartmentEntity updateDepartment(Long id, DepartmentEntity departmentEntity);

    public DepartmentEntity getDepartmentByName(String name);
}
