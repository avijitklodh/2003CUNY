package dev.ranieri.services;


public interface PointTransferService {
	
	public boolean transferPoints(Integer senderId, Integer recieverId, Integer amount);

}
