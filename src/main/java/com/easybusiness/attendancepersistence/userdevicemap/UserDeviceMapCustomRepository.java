package com.easybusiness.attendancepersistence.userdevicemap;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.UserDeviceMap;

public interface UserDeviceMapCustomRepository {

    UserDeviceMap getUserDeviceMapById(Long id);

    void deleteUserDeviceMap(Long id);

    void updateUserDeviceMap(UserDeviceMap userDeviceMap);

    void addUserDeviceMap(UserDeviceMap userDeviceMap);

    List<UserDeviceMap> getAllUserDeviceMaps();

}
