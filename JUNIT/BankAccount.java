package juntiiexamples;

public class BankAccount {
	 public Integer withdraw(Integer withdra) throws InsufficientFundsException{
	        Integer balance=9000;
	        if(withdra>9000){
	            throw new InsufficientFundsException("insufficient balance");
	        }
	        else {
	            System.out.println(balance=balance-withdra);
	        }

	        return balance;
	    }

	}
	class InsufficientFundsException extends Exception{
	    public InsufficientFundsException(String message){

	        super(message);
	    }
}
