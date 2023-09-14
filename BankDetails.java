package CoreJavaMileStone;

import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
	
		     
	   //create object for class & call a  method
		BankAccount bank=new BankAccount("Tharani","123456789");
		bank.getAccountName();
		bank.getAccountNumber();
	    bank.displaybal1();
		bank.deposit(5000);
		bank.withdrawal(3000);
		
	SavingsAccount bankinterest=new SavingsAccount();
		bankinterest.addInterest();
		bankinterest.displaybal2();
}
	}

//class for username,account number,deposit,withdrawl
class BankAccount{
	private String accountName;
	private String accountNumber;
	protected double Balance;
	
	public String getAccountName() {
		System.out.println(accountName); 
		return accountName;
		 
	}

	public String getAccountNumber() {
		System.out.println(accountNumber); 
		return accountNumber;
	}

	public double getBalance() {
		return Balance;
	}
	void displaybal1() {
		double amount=0;
        System.out.println("Balance:"+ amount);
    }
	//constructor
 BankAccount (String accName,String accNumber) {
	this.accountNumber=accNumber;
	this.accountName=accName;
	
}
public BankAccount(double balance2) {
	// TODO Auto-generated constructor stub
}

//Deposit
void deposit(double depositamount) {
    Balance = Balance + depositamount;
    System.out.println("After deposit,Balance="+ Balance);
}

//withdraw
void withdrawal(double withdrawamount) {
   System.out.println("withdraw amount:"+ withdrawamount);
    if (Balance >=  withdrawamount) {
        Balance = Balance -  withdrawamount;
        System.out.println("After Withdraw,Balance:"+ Balance);
    } else {
        System.out.println("no sufficient balance");
    }
   
}

}

//Interest for saving

class SavingsAccount extends BankAccount {
	
SavingsAccount() {
		super(Balance);
		
	}
protected static double Balance=5000;
int interest=2;
void addInterest() {
	 int rate=2;
	System.out.println("balance before interest:"+Balance);
	double Balance1=Balance*rate;
	System.out.println("balance After interest: "+Balance1);
}
public void displaybal2() {
	// TODO Auto-generated method stub
	
}
void displaybal2(String Balance1) {
	System.out.println("Balance:"+ Balance1);
}

}

//After 3 transactions ,500 Rs can be deducted from balance