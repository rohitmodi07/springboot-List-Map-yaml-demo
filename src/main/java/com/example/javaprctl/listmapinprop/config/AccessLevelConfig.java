package com.example.javaprctl.listmapinprop.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "roletype")
public class AccessLevelConfig {

	private Map<String, String> roles;

	public Map<String, String> getRoles() {
		return roles;
	}

	public void setRoles(Map<String, String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "AccessLevelConfig [roles=" + roles + "]";
	}
	
}
