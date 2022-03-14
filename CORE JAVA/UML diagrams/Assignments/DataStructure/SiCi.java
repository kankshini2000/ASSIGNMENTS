package java_program;
import java.util .*;
public class SiCi {

	public static void main(String[] args) {
		double pr,rate,t,sim,com;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the pr amount : ");
		pr= obj.nextDouble();
		System.out.println("enter the rate : ");
		rate= obj.nextDouble();
		System.out.println("enter the time : ");
		t= obj.nextDouble();
		obj.close();
		sim= (pr*rate*t)/100;
		System.out.println("The simple inetrest is : "+ sim);
		com=pr*(Math.pow(1.0+rate/100.0,t))- pr;
		System.out.println("The compound inetrest is : "+ com);
	}
}
