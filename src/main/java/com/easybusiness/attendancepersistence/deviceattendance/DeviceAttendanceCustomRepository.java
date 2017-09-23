package com.easybusiness.attendancepersistence.deviceattendance;

import java.sql.Date;
import java.util.List;

import com.easybusiness.attendancepersistence.entity.DeviceAttendance;
import com.easybusiness.attendancepersistence.entity.UserDeviceEffort;

public interface DeviceAttendanceCustomRepository {

    DeviceAttendance getDeviceAttendanceById(Long attendanceId);

    void deleteDeviceAttendance(Long attendanceId);

    void updateDeviceAttendance(DeviceAttendance deviceAttendance);

    void addDeviceAttendance(DeviceAttendance deviceAttendance);

    List<DeviceAttendance> getAllDeviceAttendances();
    
    List<UserDeviceEffort> groupByUserAndDate(Date attendanceDate);

}
