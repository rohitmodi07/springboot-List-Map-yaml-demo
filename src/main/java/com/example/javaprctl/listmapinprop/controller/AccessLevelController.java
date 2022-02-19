package com.example.javaprctl.listmapinprop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.javaprctl.listmapinprop.services.AccessLevelServices;

@RestController
public class AccessLevelController {
	
	@Autowired
	private AccessLevelServices accessLevelService;
	
	@GetMapping("/role")
	public String getAccessLevelBasedOnRole(@RequestParam("roletype") String role) {
		
		return accessLevelService.getAccessLevel(role);
		
	}
	
	@GetMapping("/department")
	public List<String> getDepartmentList() {
		
		return accessLevelService.getDepartmentList();
		
	}

}
