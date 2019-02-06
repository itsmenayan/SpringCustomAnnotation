package com.java.timelogger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.timelogger.log.LogExecutionTime;
import com.java.timelogger.service.ProjectService;


@RestController
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@GetMapping("/testTimeTaken")
	@LogExecutionTime
	public String testTimeTaken() {
		return projectService.dummyMethod();
	}

}