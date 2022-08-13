package com.kcbgroup.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kcbgroup.main.resource.User;
import com.kcbgroup.main.service.serviceImpl.EmailSenderServiceImpl;

@RestController
public class EmailSenderController {
	
	@Autowired
	private EmailSenderServiceImpl service;
	
	@Autowired
	private User user;
	
	Logger logger = LoggerFactory.getLogger(EmailSenderController.class);
	
	@GetMapping("/send")
	public String sendEmail() {
		/*
		 * Creating a User with the help of User class that we have declared and setting
		 * Email address of the sender.
		 */ 
		
		user.setEmailAddress("madalinealbright2@gmail.com");
		user.setName("Madaline Albright");
		/*
		 * Here we will call sendEmail() for Sending mail to the sender.
		 */
		try {
			service.sendSimpleEmail(user);
			return "Mail Sent Successfully";
		} catch (MailException mailException) {
			logger.error("----------Could not send email-----", mailException);
		}
		return "OOps something went wrong";
	}

	}


