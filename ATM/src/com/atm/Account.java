package com.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance =0;
	private double savingBalance =0;
	
	/*Set customer number*/
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
		
	}
	/*get customer number*/
	public int getCustomerNumber() {
		return customerNumber;
	}
	/*get and set the pin number*/
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	/*get Checking account balance*/
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	/*get saving account balance*/
	public double getSavingBalance() {
		return savingBalance;
	}
	
	/*calculate checking account withdraw*/
	public double calcCheckingWithdraw(double amount) {
		checkingBalance =(checkingBalance - amount);
		return checkingBalance;
	}
	
	/*calculate Saving account withdraw*/
	public double calcSavingWithdraw(double amount) {
		savingBalance =(savingBalance - amount);
		return savingBalance;
	}
	
	/*calculate Checking account deposite*/
	public double calcCheckingDeposite(double amount){
		checkingBalance = (checkingBalance +amount);
		return checkingBalance;
	}
	
	/*calculate saving account deposite*/
	public double calcSavingDeposite(double amount){
		savingBalance = (savingBalance +amount);
		return savingBalance;
	}
	
	/*cutomer checking balance widthdraw input*/
	public void getCheckingWithdrawInput() {
		System.out.println("Checking account balance:"+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want withdraw from Checking Account");
		double amount =input.nextDouble();
		
		if(( checkingBalance- amount)>=0) {
			calcCheckingWithdraw(amount);
			System.out.println("New checking balance: "+moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balamce cannot be negative");
			
		}
	}
	
	
	/*cutomer Saving Account widthdraw input*/
	public void getSavingWithdrawInput() {
		System.out.println("Saving account balance:"+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want withdraw from Checking Account");
		double amount =input.nextDouble();
		
		if(( savingBalance- amount)>=0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving balance: "+savingBalance);
		}else {
			System.out.println("Balamce cannot be negative");
			
		}
	}
	
	/*cutomer checking Account Deposit input*/
	public void getCheckingDepositeInput() {
		System.out.println("Checking account balance:"+ moneyFormat.format(checkingBalance));
		System.out.println("Amount you want withdraw from Checking Account");
		double amount =input.nextDouble();
		
		if(( checkingBalance+ amount)>=0) {
			calcCheckingDeposite(amount);
			System.out.println("New checking balance: "+moneyFormat.format(checkingBalance));
		}else {
			System.out.println("Balance cannot be negative");
			
		}
	}
	

	/*cutomer Saving Account widthdraw input*/
	public void getSavingDepositeInput() {
		System.out.println("Saving account balance:"+ moneyFormat.format(savingBalance));
		System.out.println("Amount you want withdraw from Checking Account");
		double amount =input.nextDouble();
		
		if(( savingBalance- amount)>=0) {
			calcSavingDeposite(amount);
			System.out.println("New Saving balance: "+savingBalance);
		}else {
			System.out.println("Balamce cannot be negative");
			
		}
	}
	
	
	
	
	
}
