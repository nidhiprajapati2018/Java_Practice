package assignment_magnus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class BankAccount {
     int accountNumber;
     String accountHolderName;
     double balance;
     
     BankAccount(){
    	 
     }
     
     
     BankAccount(String accountHolderName, int accountNumber){
    	 this.accountNumber = accountNumber;
    	 this.accountHolderName = accountHolderName;
    	 this.balance = 0;
    	 
     }
     
     double deposit(double amount){
    	if(amount != 0) {
    		balance += amount;
    	}
    	this.displayBalance();
    	return balance;
     }
     
     void withdraw(double amount) {
		if(amount != 0 && amount <= balance) {
			balance -= amount;
			this.displayBalance();
		} else {
			System.out.print("Insufficient balance");
		}
    	 
     } 
     public void displayBalance(){
    	 System.out.println("Current Balance is " + balance);
     }
}


public class BankAccountSystem {

	public static void main(String[] args) {
		
		List<BankAccount> accList = new ArrayList<>();
		
	    char option = 'A';
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the option");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposit");
			System.out.println("C. Withdraw");
			System.out.println("E. Exit");
			
			do {
				option = sc.next().charAt(0);
				
				switch(option) {
				BankAccount bc = new BankAccount();
				case 'A':
					
					bc.displayBalance();
					break;
				
				case 'B':
				System.out.println("Enter the deposite amount");
				int amount = sc.nextInt();
				bc.deposit(amount);
				
				case 'c':
					System.out.println("Enter the amount to withdraw");
					int amount = sc.nextInt();
					bc.withdraw(amount);
					break;
				default:
					System.out.println("Invlid option");
				
					
				
			}
				}
				while(option != 'E') {
				System.out.println("Thanks for using sevice");
			}
			
			
			String name = sc.next();
			
			Random rand = new Random();
			int acctNum = (int)(rand.nextDouble()*10000000000L);
			
			BankAccount acc = new BankAccount(name, acctNum);
			
			System.out.println(acc.toString());
		}
			} 
			catch(Exception e) {
			System.out.print("Error while reading data");
		}
		
	}

}
