package com.app.todoapp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.todoapp.models.Task;
import com.app.todoapp.service.TaskService;

@Controller
@RequestMapping("/task")
public class TaskController {
	
	TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping
	public String getAllTask(Model model){
		List<Task> tasks = taskService.getAllTask();
		model.addAttribute("tasks", tasks);
		return "tasks";
	}
	
	@PostMapping
	public String addTask(@RequestParam String title) {
		taskService.addTask(title);
		return "redirect:/task";
	}
	
	@GetMapping("/{id}")
	public String deleteTask(@PathVariable Integer id) {
		taskService.deleteTask(id);
		return "redirect:/task";
	}
	
	@GetMapping("/{id}/toggle")
	public String toggleTask(@PathVariable Integer id) {
		taskService.toggleTask(id);
		return "redirect:/task";
	}
}
