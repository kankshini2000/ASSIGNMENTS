
class exception{
	int a,b;
	int c,d;
	exception(){
		System.out.println("Exception constructr");
	}
	void setnos(int a,int b) {
		this.a=a;
		this.b=b;
	}
	int div() {
		return a/b;
	}
}
public class assign4q1 {

	public static void main(String[] args) {
		exception e1=new exception();
		e1.setnos(6, 0);
		try {
			System.out.println(e1.div());
		}
		catch(ArithmeticException|UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
	}
}
