package com.example.javaprctl.listmapinprop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.javaprctl.listmapinprop.connector.AccessLevelConnector;

@Service
public class AccessLevelServices {
	
	@Autowired
	private AccessLevelConnector accessLevelConnector;
	
	public String getAccessLevel(String roletype) {
		return accessLevelConnector.getAccessLevel(roletype);
	}
	
	public List<String> getDepartmentList(String depttype) {
		return accessLevelConnector.getDepartmentList(depttype);
	}

}
