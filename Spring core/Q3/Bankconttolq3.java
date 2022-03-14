package springcore_example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bankconttolq3 implements ApplicationContextAware{
	private ApplicationContext context;
    public double withdraw(long accountId, double balanceToBeWithdraw){
        double newBalance=0;
        Bankaccntinterfaceq3  acc=(Bankaccntinterfaceq3 ) context.getBean("BankRepo");
        if(acc.getBalance(accountId)>=balanceToBeWithdraw)
            newBalance = acc.getBalance(accountId)-balanceToBeWithdraw;
        acc.updateBalance(accountId,newBalance);
        return newBalance;
    }
    public double deposit(long accountId, double balance){
    	Bankaccntinterfaceq3  acc=(Bankaccntinterfaceq3 ) context.getBean("BankRepo");
        double Newbalance = acc.getBalance(accountId)+balance;
        return acc.updateBalance(accountId,Newbalance);

    }
    public double getBalance(long accountId){

    	Bankaccntinterfaceq3  balance=(Bankaccntinterfaceq3 ) context.getBean("BankRepo");
       return balance.getBalance(accountId);

    }
    public boolean fundTransfer(long fromAccount, long toAccount, double amont){
    	Bankaccntinterfaceq3  repos=(Bankaccntinterfaceq3 ) context.getBean("BankRepo");
        if(repos.getBalance(fromAccount)>=amont){
           double updateAmt= amont+repos.getBalance(toAccount);

           // updating both the accounts
            repos.updateBalance(fromAccount,repos.getBalance(fromAccount)-amont);
            repos.updateBalance(toAccount,updateAmt);
            return true;
        }
        return false;
    }
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=applicationContext;
		
	}
}
