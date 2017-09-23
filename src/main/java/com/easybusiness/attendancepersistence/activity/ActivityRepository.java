package com.easybusiness.attendancepersistence.activity;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.Activity;

public interface ActivityRepository extends CrudRepository<Activity, Long>, ActivityCustomRepository {

    List<Activity> findById(Long id);

    List<Activity> findByActivityName(String activityName);

}
