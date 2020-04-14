package dev.ranieri.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.entities.task.Task;
import dev.ranieri.services.TaskService;
import dev.ranieri.services.TaskServiceImpl;

public class TaskController {
	
	TaskService tserv = new TaskServiceImpl();
	
	public void getAllTasks(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		List<Task> tasks = tserv.retrieveAllTasks();	
		PrintWriter pw = response.getWriter();
		String s = tasks.toString();
		System.out.println(s);
		pw.append(s);
		
	}
	

}
