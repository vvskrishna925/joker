package com.wipro.ccbill.entity;

import java.util.Date;

import com.wipro.ccbill.exception.InputValidationException;

public class CreditCardBill {
	private String creditCardNo;
	private String customerId;
	@SuppressWarnings("unused")
	private Date billDate;
	private Transaction monthTransaction[];
	public CreditCardBill() {
		
	}
	public CreditCardBill(String creditCardNo, String customerId, Date billDate, Transaction[] monthTransaction) {
		this.creditCardNo = creditCardNo;
		this.customerId = customerId;
		this.billDate = billDate;
		this.monthTransaction = monthTransaction;
	}
	public double getTotalAmount (String transactionType) {
		double amount=0;
		if(transactionType.contentEquals("DB") || transactionType.contentEquals("CR"))
		{
		for(int i=0;i< monthTransaction.length;i++) {
				if(monthTransaction[i].getTransactionType().contentEquals(transactionType))	
					amount += monthTransaction[i].getTransactionAmount();
			}
		return amount;
		}
		return 0;
	}
	public double calculateBillAmount () {
		try {
			if(validateData().contentEquals("valid")) {
				if(monthTransaction.length>0) {
					double db=getTotalAmount("DB");
					double cr=getTotalAmount("CR");
					double outstanding=db-cr;
					if(outstanding<0)
					{
						throw new InputValidationException();
					}
					double interest=outstanding*0.199/12;
					return outstanding+interest;
				}
				return 0.0;
			}
			return 0.0;
		}
		catch(Exception e) {
			return 0.0;
		}
	}
	public String validateData() throws InputValidationException {
		if(creditCardNo.length()!=16||customerId.length()<6)
			throw new InputValidationException();
		return "valid";
	}
}
