package java_program;
class accnt{
	public String name;
	protected String email;
	private String pass;
	
	public String getpass() {
		return this.pass;
	}
	private void setpass(String password) {
		this.pass=password; 
	}
}

public class bank {

	public static void main(String[] args) {
		accnt accnt1=new accnt();
		accnt1.name="java";
		accnt1.email="java@yahoo.com";
		accnt1.setpass("abcd");
		System.out.println(accnt1.getpass());
	}
}
