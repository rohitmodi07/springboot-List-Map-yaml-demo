package com.example.javaprctl.listmapinprop.connector;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.javaprctl.listmapinprop.config.AccessLevelConfig;
import com.example.javaprctl.listmapinprop.config.DepartmentListConfig;

@Component
public class AccessLevelConnector {
	
	@Autowired
	private AccessLevelConfig accessLevelConfig;
	@Autowired
	private DepartmentListConfig departmentListConfig;
	
	public AccessLevelConnector() {
		accessLevelConfig = new AccessLevelConfig();
		departmentListConfig = new DepartmentListConfig();
	}
	
	public String getAccessLevel(String roletype) {
		
		return accessLevelConfig.getRoles().get(roletype);
	}
	
    public List<String> getDepartmentList(String depttype) {
		
		return departmentListConfig.getComputer();
	}

}
