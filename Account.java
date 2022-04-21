package ATM1;

import java.util.Scanner;
import java.text.DecimalFormat;

public  class Account {
	 
	private int CardNumber;
	private int pinNumber;
    private double checkingBalance=0;
    private double savingBalance=0;
    
    Scanner s= new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    
    public int getCardNumber() {
    	return CardNumber;
    }
    
    public int setCardNumber(int CardNumber) {
    	this.CardNumber=CardNumber;
    	return CardNumber;
    }
    
    public int getpinNumber() {
    	return pinNumber;
    	}
    
    public int setpinNumber(int pinNumber) {
    	this.pinNumber=pinNumber;
    	return pinNumber;
    }
    public double getcheckingBalance() {
    	return checkingBalance;
    }
    
    public double getsavingBalance() {
    	return savingBalance;
    }
    
    public double checkwithdrawAmount(double Amount) {
    	checkingBalance=checkingBalance-Amount;
    	return checkingBalance;
     }
    public double savingwithdrawAmount(double Amount) {
    	savingBalance=savingBalance-Amount;
    	return savingBalance;
     }
    
    public double checkdepositAmount(double Amount) {
    	checkingBalance=checkingBalance+Amount;
    	return checkingBalance;
    	}
    
    public double savingdepositAmount(double Amount) {
    	savingBalance=savingBalance+Amount;
    	return checkingBalance;
    	}
    
    public void  checkingwithdrawInput() {
    
    	 System.out.println("Current Account Balance:"+ moneyFormat.format(checkingBalance));
     	System.out.println("Enter the Amount to Withdraw from Current Account:");
     	double Amount=s.nextDouble();
       
     if(checkingBalance-Amount>=0) {
     	checkwithdrawAmount(Amount);
     	System.out.println("Your Current Account Balance is:"+moneyFormat.format(checkingBalance));
     	}
     else {
     	System.out.println("Transaction limit Exceeded:");
     	 }
     }
    
    public void savingwithdrawInput() {
    	
    	System.out.println("Saving Account Balance:"+ moneyFormat.format(savingBalance));
     	System.out.println("Enter the Amount to Withdraw from Saving Account:");
     	double Amount=s.nextDouble();
       
     if(savingBalance-Amount>=0) {
     	savingwithdrawAmount(Amount);
     	System.out.println("Your Saving Account Balance is:"+moneyFormat.format(savingBalance));
     	}
     else {
     	System.out.println("Transaction limit Exceeded:");
     	 }    
     }
    
    public void checkingDepositInput() {
        
   	 System.out.println("Current Account Balance:"+ moneyFormat.format(checkingBalance));
    	System.out.println("Enter the Amount to Deposit to Current Account:");
    	double Amount=s.nextDouble();
    	 checkdepositAmount(Amount);
    	
     System.out.println("Your new Current Account Balance is:"+moneyFormat.format(checkingBalance));
    }
    
    public void savingDepositInput() {
    	System.out.println("Saving Account Balance:"+ moneyFormat.format(savingBalance));
    	System.out.println("Enter the Amount to Deposit to Saving Account:");
    	double Amount=s.nextDouble();
    	savingdepositAmount(Amount);
      System.out.println("Your new Saving Account Balance is:"+moneyFormat.format(savingBalance));
    }
  
    
    }
    

    
    

