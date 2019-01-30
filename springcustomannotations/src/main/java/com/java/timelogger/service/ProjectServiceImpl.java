package com.java.timelogger.service;

import org.springframework.stereotype.Service;

import com.java.timelogger.log.LogExecutionTime;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Override
	@LogExecutionTime
	public String dummyMethod() {
		return "In Service";
	}

}
