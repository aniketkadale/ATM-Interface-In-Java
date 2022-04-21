package ATM1;

import java.util.HashMap;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.IOException;

public class Menu extends Account {

	Scanner sc=new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	
	static int pin,rpin;
	
	public void newpin() {
		System.out.println("Enter the pinNumber:");
    	 pin=sc.nextInt();
        
    	 System.out.println("Please Re-enter your pinNumber");
         rpin=sc.nextInt();
	}
	
	public void condition() {
		if( pin==rpin) {
            System.out.println("Successfully created your Account");
          }
           else {
        	   System.out.println("Pin Don't Match:");
        	   newpin();
          }
	}
	
	public void login() throws IOException {
		int x=0;
		do {
		try {
			 data.put(932572,9371);
			 data.put(456595,5956 );
			 data.put(184507, 5891);
			 data.put(565600,8766);
			
			 System.out.println("                 Welcome to IOIT ATM");
			
			    System.out.println("              Please Enter your CardNumber:");
			    setCardNumber(sc.nextInt());
			    
			    System.out.println("Please Enter your 4 digit PIN:");
			    setpinNumber(sc.nextInt());
			}
		
		catch (Exception e) { 
			System.err.println("Invalid Format");
			System.out.println("Thank for Visiting IOIT ATM");
			while(x==0);
			login();
		   
			}
		
	
	    
		int cn=getCardNumber();
        int pn=getpinNumber();
       
        if(data.containsKey(cn) && data.get(cn)==pn){
        	getAccountType();
        }
        else {
        	System.out.println("Invalid CardNumber or PIN");
        	System.out.println("If you Dont have acccount please Create a New Account");
        	System.out.println("Enter Your Card Number:");
        	
        	int cno=sc.nextInt();
        	if(cn==cno) {
        		System.out.println("Already Exist..Please Re-enter");
        		
        	}
        	newpin();
        	condition();
        	data.put(cno, rpin);
        	System.out.println("Redirecting to Login>>>>>>>>");
        	login();
     }
       
		}while(x==0);
	}
	
	public void getAccountType() {
		
		System.out.println("Select the Account Type:");
		System.out.println("1-Current Account");
		System.out.println("2-Savings Account");
		System.out.println("3-Exit");
		
		int op=sc.nextInt();
		switch(op) {
		case 1:getCurrent();
		break;
		case 2:getSavings();
		break;
		case 3:
				System.out.println("Thank you For Visiting IOIT ATM");
				System.exit(0);
				default:
					System.out.println("Invalid Choice");
					getAccountType();
		}
	}
	
		public void getCurrent() {
			System.out.println("Current Account");
			System.out.println("1-View Balance");
			System.out.println("2-Withdraw Money");
			System.out.println("3-Deposit Money");
			System.out.println("4-Exit");
		
		int op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("Current Account Balance is:"+moneyFormat.format(getcheckingBalance()));
			getAccountType();
		break;
		case 2:checkingwithdrawInput();
		getAccountType();
		break;
		case 3:checkingDepositInput();
		getAccountType();
		break;
		case 4:
			System.out.println("Thank you For Visiting IOIT ATM");
			System.exit(0);
				default:
					System.out.println("Invalid Choice");
					getCurrent();
		
		}
		
		}
		public void getSavings() {
			System.out.println("Savings Account");
			System.out.println("1-View Balance");
			System.out.println("2-Withdraw Money");
			System.out.println("3-Deposit Money");
			System.out.println("4-Exit");
		
		int op=sc.nextInt();
		switch(op) {
		case 1:
			System.out.println("Savings Account Balance is:"+moneyFormat.format(getsavingBalance()));
			getAccountType();
		break;
		case 2:savingwithdrawInput();
		getAccountType();
		break;
		case 3:savingDepositInput();
		getAccountType();
		break;
		case 4:
			System.out.println("Thank you For Visiting IOIT ATM");
			System.exit(0);
				default:
					System.out.println("Invalid Choice");
					getSavings();
					
		     }
		
		}
		  
		
}
        
	
	
	
	