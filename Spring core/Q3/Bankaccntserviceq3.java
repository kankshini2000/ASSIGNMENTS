package springcore_example;

public interface Bankaccntserviceq3 {
	public double withdraw(long accId, double balance);
    public double deposit(long accId, double balance);
    public double getBalance(long accId);
    public boolean fundTransfer(long fromAccount, long toAccount, double amont);
}
