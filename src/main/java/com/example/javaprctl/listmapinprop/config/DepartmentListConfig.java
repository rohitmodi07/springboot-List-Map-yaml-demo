package com.example.javaprctl.listmapinprop.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "department")
public class DepartmentListConfig {

	private List<String> computer;

	public List<String> getComputer() {
		return computer;
	}

	public void setComputer(List<String> computer) {
		this.computer = computer;
	}

	@Override
	public String toString() {
		return "DepartmentListConfig [computer=" + computer + "]";
	}
	
}
