package com.easybusiness.attendancepersistence.machinemaster;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.MachineMaster;

public interface MachineMasterRepository extends CrudRepository<MachineMaster, String>, MachineMasterCustomRepository {

    List<MachineMaster> findByMachineCode(String machineCode);

    List<MachineMaster> findByMachineDesc(String machineDesc);
    
    List<MachineMaster> findByDept(String department);

}
