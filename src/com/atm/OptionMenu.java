/**Main class
 * 
 */
package com.atm;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Dhuvaraganath
 *
 */
public class OptionMenu extends Account {
	 int selection;
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat =new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	/*Valid login information custemer number and pin number*/
	
	public void getLogin() throws IOException{
		int x =1;
		
		do {
			try {
				data.put(1000,123);
				data.put(1001,123);
				
				System.out.println("Welcom to the ATM ");
				
				System.out.println("Enter your Customer name");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your Pin number");
				setPinNumber(menuInput.nextInt());
					
			}catch(Exception e) {
				System.out.println("\n"+"Invalid Charater(s).Only numbers."+"\n");
				x =2;
			}
			for (Entry<Integer,Integer>entry : data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()==getPinNumber() )
				{
					getAccountType();
				}
				System.out.println("Worng Customer number or Pin number");
			}
		}while(x==1);
	}
  
/*Display Account type menu and Selection*/
	public void getAccountType() {
		System.out.println("Select the Account");
		System.out.println("Type 1 - Checking Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;	
		
		
	    case 3:
		   System.out.println("Thank you for using ATM");
		   break;
		   
		default:
			System.out.println("Invalid choice");
			getAccountType();
		}
	}
	/*Display Checking Account menu with Selection*/
	public void getChecking() {
			System.out.println("Checking Acccount");
			System.out.println("Type 1 -View Balance");
			System.out.println("Type 2 -Widthdraw Balance");
			System.out.println("Type 3 -Deposite Balance");
			System.out.println("Type 4 -Exit");
			System.out.println("choice: ");
			
			selection =menuInput.nextInt(); 
			
			switch(selection) {
			case 1:
				System.out.println("Checking account balance :"+ moneyFormat.format(getCheckingBalance()));
				getAccountType();
				break;
				
			case 2:
				getCheckingWithdrawInput();
				getAccountType();
				break;	
			
			
		    case 3:
		    	getCheckingDepositeInput();
		    	getAccountType();
			   break;
			
		    case 4:
		    	System.out.println("Thank for using ATM...");
			
		    default:
		    	System.out.println("Invalid Choice");
		    	getChecking();
			}
			
    }
	
	/*Display saving Account menu with selection*/
	
	public void getSaving() {
		System.out.println("Saving Acccount");
		System.out.println("Type 1 -View Balance");
		System.out.println("Type 2 -Widthdraw Balance");
		System.out.println("Type 3 -Deposite Balance");
		System.out.println("Type 4 -Exit");
		System.out.println("choice: ");
		
		selection =menuInput.nextInt(); 
		
		switch(selection) {
		case 1:
			System.out.println("Checking account balance :"+ moneyFormat.format(getSavingBalance()));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;	
		
		
	    case 3:
	    	getCheckingDepositeInput();
	    	getAccountType();
		   break;
		
	    case 4:
	    	System.out.println("Thank for using ATM...");
		
	    default:
	    	System.out.println("Invalid Choice");
	    	getChecking();
		}
	}
	
	
}
