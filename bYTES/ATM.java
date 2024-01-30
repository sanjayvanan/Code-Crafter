// write a java program to implement a atm machine reqquirements 
// 1. pin change
// 2. withdraw
// 3.balance
// 4.exit
import java.util.Scanner;

public class ATM
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int pin = 1234,balance = 100, amt=0, newpin =0;
		while(true){
		    System.out.print("1.pinchange /n 2.withdraw /n 3.balance /n 4.exit");
		    int getval = s.nextInt();
		    switch(getval){
		        case 1: 
		            System.out.print("Enter your old pin :");
		            int oldpin = s.nextInt();
		            newpin = s.nextInt();
		            System.out.print(changepin(oldpin,newpin));
		    }
		}
		
	}
	
		public static int changepin(){
		            if(pin!=oldpin){
		                System.out.println("Sorry wrong pin ");
		                break;
		            }
		            if(pin == oldpin){
		              
		                changepin(newpin);
		                System.out.print("It is succesfully changed");
		                break;
		            }
    	}
    	
    	public static int withdraw(int amt){
    	    
    	}
    	public static int exit(){
    	    
    	}
	

}


