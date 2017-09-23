package com.easybusiness.attendancepersistence.employeemaster;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.EmployeeMaster;

public interface EmployeeMasterRepository extends CrudRepository<EmployeeMaster, String>, EmployeeMasterCustomRepository {

    List<EmployeeMaster> findByEbId(String ebId);

    List<EmployeeMaster> findByEbFixedId(String ebFixedId);
    
    List<EmployeeMaster> findByUserId(String userId);

}
