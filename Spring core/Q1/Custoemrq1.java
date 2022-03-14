package springcore_example;

public class Custoemrq1 {
	private  int customerId;
    private String  customerName;
    private String customerContact;
    private Addressq1 customerAddress;
	public Custoemrq1(int customerId, String customerName, String customerContact, Addressq1 customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Addressq1 getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Addressq1 customerAddress) {
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Custoemrq1 [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
    
}
