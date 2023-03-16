package com.ndemeyvan.dcb_learn_spring_boot.repositories;

import com.ndemeyvan.dcb_learn_spring_boot.entities.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {

    public DepartmentEntity findByDepartmentName(String departmentName);

}
