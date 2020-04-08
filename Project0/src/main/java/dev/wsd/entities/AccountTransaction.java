package dev.wsd.entities;

import java.util.Date;

/**
 * @author Admin
 * @version 1.0
 * @created 07-Apr-2020 8:56:23 AM
 */
public class AccountTransaction {

	private int id;
	private UserAccount account;
	private TransactionType transType ;
	private float transAmount;
	private float amountBefore;
	private Date transDate;
	private String Comment;

	public AccountTransaction(){

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserAccount getAccount() {
		return account;
	}

	public void setAccount(UserAccount account) {
		this.account = account;
	}

	public TransactionType getTransType() {
		return transType;
	}

	public void setTransType(TransactionType transType) {
		this.transType = transType;
	}

	public float getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(float transAmount) {
		this.transAmount = transAmount;
	}

	public float getAmountBefore() {
		return amountBefore;
	}

	public void setAmountBefore(float amountBefore) {
		this.amountBefore = amountBefore;
	}

	public Date getTransDate() {
		return transDate;
	}

	public void setTransDate(Date transDate) {
		this.transDate = transDate;
	}

	public String getComment() {
		return Comment;
	}

	public void setComment(String comment) {
		Comment = comment;
	}

 
	 
}