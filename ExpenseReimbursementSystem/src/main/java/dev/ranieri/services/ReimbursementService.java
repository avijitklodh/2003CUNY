package dev.ranieri.services;

import dev.ranieri.entities.Reimbursement;

public interface ReimbursementService {

	public Reimbursement submitReimbursement(Reimbursement reimbursement);
	
	public Reimbursement approrveReimbursement(Reimbursement reimbursement);
	
	public Reimbursement denyReimbursement(Reimbursement reimbursement);
	
	public Reimbursement approrveReimbursement(Reimbursement reimbursement, boolean isApproved);
	
	
}
