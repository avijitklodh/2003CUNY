package dev.ranieri.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import dev.ranieri.app.RpasClient;
import dev.ranieri.entities.Associate;

@Service
public class EnlistServiceImpl implements EnlistService {
	
	@Autowired
	RpasClient rpasClient;
	
	@Autowired
	JavaMailSender mailer;

	@Override
	public Associate enlistAssociate(Associate associate, String email) {
		
		Associate enrolled = rpasClient.createAssociate(associate);
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(email);
		message.setSubject("RPAS registration");
		message.setText("Thanks for registering with RPAS!! your RPAS id is " +enrolled.getaId());
		
		mailer.send(message);
		
		return enrolled;
	}
	
	
	

}
