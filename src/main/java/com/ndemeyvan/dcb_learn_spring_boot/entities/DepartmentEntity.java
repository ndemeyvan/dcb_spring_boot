package com.ndemeyvan.dcb_learn_spring_boot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DepartmentEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long departmentId;
        private String departmentName;
        private String departmentAddress;
        private String departmentCode;


        public DepartmentEntity(Long departmentId, String departmentName, String departmentAddress, String departmentCode) {
                this.departmentId = departmentId;
                this.departmentName = departmentName;
                this.departmentAddress = departmentAddress;
                this.departmentCode = departmentCode;
        }

        public DepartmentEntity() {

        }

        public Long getDepartmentId() {
                return departmentId;
        }

        public void setDepartmentId(Long departmentId) {
                this.departmentId = departmentId;
        }

        public String getDepartmentName() {
                return departmentName;
        }

        public void setDepartmentName(String departmentName) {
                this.departmentName = departmentName;
        }

        public String getDepartmentAddress() {
                return departmentAddress;
        }

        public void setDepartmentAddress(String departmentAddress) {
                this.departmentAddress = departmentAddress;
        }

        public String getDepartmentCode() {
                return departmentCode;
        }

        public void setDepartmentCode(String departmentCode) {
                this.departmentCode = departmentCode;
        }

        @Override
        public String toString() {
                return "DepartmentEntity{" +
                        "departmentId=" + departmentId +
                        ", departmentName='" + departmentName + '\'' +
                        ", departmentAddress='" + departmentAddress + '\'' +
                        ", departmentCode='" + departmentCode + '\'' +
                        '}';
        }
}
