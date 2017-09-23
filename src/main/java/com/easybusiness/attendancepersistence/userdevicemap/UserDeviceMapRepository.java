package com.easybusiness.attendancepersistence.userdevicemap;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.User;
import com.easybusiness.attendancepersistence.entity.UserDeviceMap;

public interface UserDeviceMapRepository extends CrudRepository<UserDeviceMap, Long>, UserDeviceMapCustomRepository {

    List<UserDeviceMap> findById(Long i);

    List<UserDeviceMap> findByUser(User user);

    List<UserDeviceMap> findByDeviceId(Long deviceId);

}
