package com.easybusiness.attendancepersistence.machinemaster;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.MachineMaster;

public interface MachineMasterCustomRepository {

    MachineMaster getMachineMasterByMachineCode(String machineCode);

    void deleteMachineMaster(String machineCode);

    void updateMachineMaster(MachineMaster machineMaster);

    void addMachineMaster(MachineMaster machineMaster);

    List<MachineMaster> getAllMachineMasters();

}
