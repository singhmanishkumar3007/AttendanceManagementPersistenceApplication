package com.easybusiness.attendancepersistence.userdeviceeffort;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.BiometricTransaction;
import com.easybusiness.attendancepersistence.entity.Task;
import com.easybusiness.attendancepersistence.entity.User;
import com.easybusiness.attendancepersistence.entity.UserDeviceEffort;

public interface UserDeviceEffortRepository
	extends CrudRepository<UserDeviceEffort, Long>, UserDeviceEffortCustomRepository,JpaSpecificationExecutor<UserDeviceEffort> {

    List<UserDeviceEffort> findById(Long i);

    List<UserDeviceEffort> findByUser(User user);
    
    List<UserDeviceEffort> findByUserAndEffortDate(User user,Date effortdate);
    
    List<UserDeviceEffort> findByUserAndEffortDateAndTask(User user,Date effortdate,Task task);
    
    List<UserDeviceEffort> findByUserAndEffortDateAndBiometricTransaction(User user,Date effortdate,BiometricTransaction biometricTransaction);
    
    List<UserDeviceEffort> findByUserAndBiometricTransaction(User user,BiometricTransaction biometricTransaction);

}
