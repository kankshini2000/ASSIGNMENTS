package springcore_example;

public class Bankaccntreposq3 implements  Bankaccntinterfaceq3  {

	public Bankaccntq3 banlaccnt;
	public Bankaccntq3 banlaccnt1;
	
	public Bankaccntreposq3() {}
	public Bankaccntreposq3(Bankaccntq3 banlaccnt, Bankaccntq3 banlaccnt1) {
		this.banlaccnt = banlaccnt;
		this.banlaccnt1 = banlaccnt1;
	}

	public double getBalance(long accId) {
		if(this.banlaccnt.getAccId()==accId){
	           return banlaccnt.getAccBalance();
	        }
	        else{
	           return  banlaccnt.getAccBalance();
	        }
	}

	public double updateBalance(long accId, double newBalance) {
		double updatedBal=0;
        if(this.banlaccnt1.getAccId()==accId){
            updatedBal = newBalance;
            banlaccnt.setAccBalance(updatedBal);
        }
        else{
        	updatedBal = newBalance;
            banlaccnt1.setAccBalance(updatedBal);
        }

		return updatedBal;
	}
	
	
}
