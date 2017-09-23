package com.easybusiness.attendancepersistence.userdeviceeffort;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.UserDeviceEffort;

public interface UserDeviceEffortCustomRepository {

    UserDeviceEffort getUserDeviceEffortById(Long effortId);

    void deleteUserDeviceEffort(Long effortId);

    void updateUserDeviceEffort(UserDeviceEffort userDeviceEffort);

    void addUserDeviceEffort(UserDeviceEffort userDeviceEffort);

    List<UserDeviceEffort> getAllUserDeviceEfforts();

}
