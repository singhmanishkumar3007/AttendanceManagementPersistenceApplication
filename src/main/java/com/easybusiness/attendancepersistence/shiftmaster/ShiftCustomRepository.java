package com.easybusiness.attendancepersistence.shiftmaster;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.Shift;

public interface ShiftCustomRepository {

    Shift getShiftById(Long id);

    void deleteShift(Long id);

    void updateShift(Shift shift);

    void addShift(Shift shift);

    List<Shift> getAllShifts();

}
