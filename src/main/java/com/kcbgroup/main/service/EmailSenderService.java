package com.kcbgroup.main.service;

import org.springframework.mail.MailException;
import org.springframework.stereotype.Component;

import com.kcbgroup.main.resource.User;

@Component
public interface EmailSenderService  {
	
	void sendSimpleEmail(User user) throws MailException;

}
