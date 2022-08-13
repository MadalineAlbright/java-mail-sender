package com.kcbgroup.main.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kcbgroup.main.resource.User;
import com.kcbgroup.main.service.EmailSenderService;

@Service
public class EmailSenderServiceImpl implements EmailSenderService {

	// Create an object for the java mail sender

	@Autowired
	JavaMailSender javaMailSender;

	Logger logger = LoggerFactory.getLogger(EmailSenderServiceImpl.class);

	@Override
	public void sendSimpleEmail(User user) throws MailException{
		
		/*
		 * This JavaMailSender Interface is used to send Mail in Spring Boot. This
		 * JavaMailSender extends the MailSender Interface which contains send()
		 * function. SimpleMailMessage Object is required because send() function uses
		 * object of SimpleMailMessage as a Parameter
		 */
		
		SimpleMailMessage message = new SimpleMailMessage();

		message.setTo(user.getEmailAddress());
		message.setFrom("fenesa111@gmail.com");
		message.setText("Hurray .....");
		message.setSubject("Testing Mail Api");
		

		this.javaMailSender.send(message);

		logger.info("----------SENDING EMAIL--------");
		
		

	}

}
