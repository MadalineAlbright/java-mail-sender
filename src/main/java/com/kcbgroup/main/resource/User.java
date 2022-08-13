package com.kcbgroup.main.resource;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String emailAddress;
	private String name;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


}
