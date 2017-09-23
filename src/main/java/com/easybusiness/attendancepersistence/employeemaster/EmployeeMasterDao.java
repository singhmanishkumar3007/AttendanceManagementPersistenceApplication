package com.easybusiness.attendancepersistence.employeemaster;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.easybusiness.attendancepersistence.entity.EmployeeMaster;

@Component
public class EmployeeMasterDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeMasterDao.class);
    @Autowired
    DataSource dataSource;

    @Autowired
    EmployeeMasterRepository employeeMasterRepository;

    @Transactional(readOnly = true)
    public List<EmployeeMaster> findAll() throws Exception {
	LOGGER.info("DATASOURCE = " + dataSource);
	List<EmployeeMaster> employeeMasterList = new ArrayList<EmployeeMaster>();
	for (EmployeeMaster employeeMaster : employeeMasterRepository.findAll()) {
	    LOGGER.info("EmployeeMaster : " + employeeMaster);
	    employeeMasterList.add(employeeMaster);

	}
	return employeeMasterList;

    }

    @Transactional(readOnly = true)
    public EmployeeMaster findEmployeeMasterByEbId(String ebId) {
	return employeeMasterRepository.findByEbId(ebId).get(0);
    }

    @Transactional(readOnly = true)
    public EmployeeMaster findEmployeeMasterByEbFixedId(String ebFixedId) {
	return employeeMasterRepository.findByEbFixedId(ebFixedId).get(0);
    }

    @Transactional(readOnly = true)
    public List<EmployeeMaster> findEmployeeMasterByUserId(String userId) {
	return employeeMasterRepository.findByUserId(userId);
    }

}
