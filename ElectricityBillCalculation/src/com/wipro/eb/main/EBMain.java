package com.wipro.eb.main;
import java.util.*;

import com.wipro.eb.service.ConnectionService;
public class EBMain {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter previous month reading");
	int previousReading=sc.nextInt();
	System.out.println("Enter current month reading");
	int currentReading=sc.nextInt();
	System.out.println("Enter the type of connection");
	String type=sc.next();
	ConnectionService cs=new ConnectionService();
	String output=cs.generateBill(currentReading, previousReading, type);
	System.out.println(output);
	sc.close();
}
}
