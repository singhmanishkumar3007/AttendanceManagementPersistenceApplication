package com.easybusiness.attendancepersistence.task;

import java.util.List;

import com.easybusiness.attendancepersistence.entity.Task;

public interface TaskCustomRepository {

    Task getTaskById(Long id);

    void deleteTask(Long id);

    void updateTask(Task task);

    void addTask(Task task);

    List<Task> getAllTasks();

}
