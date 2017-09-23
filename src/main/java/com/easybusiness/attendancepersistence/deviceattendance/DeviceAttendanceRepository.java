package com.easybusiness.attendancepersistence.deviceattendance;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.User;
import com.easybusiness.attendancepersistence.entity.DeviceAttendance;

public interface DeviceAttendanceRepository
	extends CrudRepository<DeviceAttendance, Long>, DeviceAttendanceCustomRepository {

    List<DeviceAttendance> findById(Long i);

    List<DeviceAttendance> findByUser(User user);
    
    List<DeviceAttendance> findByUserAndAttendanceDate(User user,Date attendanceDate);

}
