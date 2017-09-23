package com.easybusiness.attendancepersistence.activity;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.Activity;

public interface ActivityCustomRepository {

    Activity getActivityById(Long id);

    void deleteActivity(Long id);

    void updateActivity(Activity activity);

    void addActivity(Activity activity);

    List<Activity> getAllActivities();

}
