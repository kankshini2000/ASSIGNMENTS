package java_program;

class Std{
	static Std s1=new Std();
	private Std() {
		
	}
	public static Std getInstance() {
		return s1;
	}
}
public class Assignment2Q1 {

	public static void main(String[] args) {
		Std s1= Std.getInstance();
		System.out.println("created a singleton"+s1);
	}

}
