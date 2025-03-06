package com.app.todoapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.todoapp.models.Task;
import com.app.todoapp.repository.TaskRepository;

@Service
public class TaskService {
	
	TaskRepository taskRepository;
	
	public TaskService(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}
	
	public List<Task> getAllTask(){
		return taskRepository.findAll();
	}
	
	public Task addTask(String title) {
		Task task = new Task(title);
		return taskRepository.save(task);
	}
	
	public void deleteTask(Integer id) {
		 taskRepository.deleteById(id);
	}

	public void toggleTask(Integer id)  {
		Task task = taskRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Task not found"));
		
			task.setCompleted(!task.isCompleted());
			taskRepository.save(task);
	}
}
