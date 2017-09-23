package com.easybusiness.attendancepersistence.employeemaster;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.easybusiness.attendancepersistence.entity.EmployeeMaster;

@Transactional
@Repository
public class EmployeeMasterRepositoryImpl implements EmployeeMasterCustomRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public List<EmployeeMaster> getAllEmployeeMasters() {
	String hql = "FROM EmployeeMaster as employeeMaster ORDER BY employeeMaster.ebId";
	return (List<EmployeeMaster>) entityManager.createQuery(hql).getResultList();
    }

}
