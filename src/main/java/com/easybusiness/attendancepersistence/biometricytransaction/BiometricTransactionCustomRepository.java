package com.easybusiness.attendancepersistence.biometricytransaction;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.BiometricTransaction;

public interface BiometricTransactionCustomRepository {

    BiometricTransaction getBiometricTransactionById(Long id);

    void deleteBiometricTransaction(Long id);

    void updateBiometricTransaction(BiometricTransaction biometricTransaction);

    void addBiometricTransaction(BiometricTransaction biometricTransaction);

    List<BiometricTransaction> getAllBiometricTransactions();

}
