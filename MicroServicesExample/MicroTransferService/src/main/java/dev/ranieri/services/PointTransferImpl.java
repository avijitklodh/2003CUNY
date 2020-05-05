package dev.ranieri.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dev.ranieri.app.RpasClient;
import dev.ranieri.entities.Associate;

@Component
@Service
public class PointTransferImpl implements PointTransferService{

	@Autowired
	RpasClient rpas;
	
	@Override
	public boolean transferPoints(Integer senderId, Integer recieverId, Integer amount) {
		
		Associate sender = rpas.getAssociateById(senderId);
		Associate reciever = rpas.getAssociateById(recieverId);
		
		sender.setPoints(sender.getPoints()-amount);
		reciever.setPoints(reciever.getPoints() +amount);
		
		rpas.updateAssociate(sender);
		rpas.updateAssociate(reciever);
		
		return true;
	}

}
