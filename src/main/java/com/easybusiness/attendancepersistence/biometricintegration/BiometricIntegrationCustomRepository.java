package com.easybusiness.attendancepersistence.biometricintegration;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.BiometricIntegration;

public interface BiometricIntegrationCustomRepository {

    BiometricIntegration getBiometricIntegrationById(Long id);

    void deleteBiometricIntegration(Long id);

    void updateBiometricIntegration(BiometricIntegration biometricIntegration);

    void addBiometricIntegration(BiometricIntegration userDeviceMap);

    List<BiometricIntegration> getAllBiometricIntegrations();

}
