package springcore_example;

public class Bankaccntq3 {
	long accId;
    String  accName;
    String  accType;
    double accBalance;
    
    public void Bankaccntq3() {}
	public Bankaccntq3(long accId, String accName, String accType, double accBalance) {
		this.accId = accId;
		this.accName = accName;
		this.accType = accType;
		this.accBalance = accBalance;
	}
	public long getAccId() {
		return accId;
	}
	public void setAccId(long accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getAccBalance() {
		return accBalance;
	}
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}
	@Override
	public String toString() {
		return "Bankaccntq3 [accId=" + accId + ", accName=" + accName + ", accType=" + accType + ", accBalance="
				+ accBalance + "]";
	}
    
}
