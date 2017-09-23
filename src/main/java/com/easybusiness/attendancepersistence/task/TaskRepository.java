package com.easybusiness.attendancepersistence.task;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.easybusiness.attendancepersistence.entity.Activity;
import com.easybusiness.attendancepersistence.entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long>, TaskCustomRepository {

    List<Task> findById(Long id);

    List<Task> findByTaskName(String taskName);
    
    List<Task> findByActivity(Activity activity);

}
