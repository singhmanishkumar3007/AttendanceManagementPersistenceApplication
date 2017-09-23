package com.easybusiness.attendancepersistence.biometricintegration;

import java.sql.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.BiometricIntegration;
import com.easybusiness.attendancepersistence.entity.UserDeviceMap;

public interface BiometricIntegrationRepository
	extends CrudRepository<BiometricIntegration, Long>, BiometricIntegrationCustomRepository {

    List<BiometricIntegration> findByIntegrationId(Long i);

    List<BiometricIntegration> findByUserDeviceMap(UserDeviceMap userDeviceMap);

    List<BiometricIntegration> findByUserDeviceMapAndInDate(UserDeviceMap userDeviceMap, Date inDate);

}
