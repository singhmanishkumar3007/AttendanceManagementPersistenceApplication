package com.easybusiness.attendancepersistence.shiftmaster;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.Shift;

public interface ShiftRepository extends CrudRepository<Shift, Long>, ShiftCustomRepository {

    List<Shift> findById(Long id);

    List<Shift> findByShiftName(String shiftName);

}
