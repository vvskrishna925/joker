package com.wipro.eb.service;

import com.wipro.eb.entity.*;
import com.wipro.eb.exception.*;

public class ConnectionService {
	public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException{
		if (currentReading < previousReading || currentReading < 0 || previousReading < 0) {
			throw new InvalidReadingException();
		}
		if (type.equalsIgnoreCase("Domestic") && type.equalsIgnoreCase("Commercial")) {
			throw new InvalidConnectionException();
		}
		return true;
	}
	public float calculateBillAmt(int currentReading, int previousReading, String type) {
		boolean result = false;
		try {
			result = validate(currentReading, previousReading, type);
		}
		catch (InvalidReadingException e) {
			return -1;
		}
		catch (InvalidConnectionException e) {
			return -2;
		}
		float amount = 0;
		if (result) {
			if (type.equalsIgnoreCase("Domestic")) {
				Domestic d = new Domestic(previousReading, currentReading, new float[] {(float) 2.3, (float) 4.2, (float) 5.5});
				amount = d.computeBill();
			}
			if (type.equalsIgnoreCase("Commercial")) {
				Commercial c = new Commercial(previousReading, currentReading, new float[] {(float) 5.2, (float) 6.8, (float) 8.3});
				amount = c.computeBill();
			}
			
		}
		return amount;
	}
	public String generateBill(int currentReading, int previousReading, String type) {
			float billAmount = calculateBillAmt(currentReading, previousReading, type);
			if (billAmount == -1) {
				return "Incorrect Reading";	
			}
			if (billAmount == -2) {
				return "Invalid ConnectionType";
			}
			return "Amount to be paid:" + String.valueOf(billAmount);
	}
}
