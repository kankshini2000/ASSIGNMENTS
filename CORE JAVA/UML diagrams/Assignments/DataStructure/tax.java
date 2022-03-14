package java_program;
import java.util.*;
public class tax {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		double tax=0,inc;
		System.out.println("enter the income:");
		inc=obj.nextDouble();
		obj.close();
		if(inc<=180000) {
			tax=0;
			System.out.print("Total tax paid is nil");
		}
		else if(inc>=181001 && inc<=300000) {
			tax=0.1*(inc-1810001);
			System.out.print("Total tax paid is "+ tax);		
		}
		else if(inc>=300001 && inc<=500000) {
			tax=0.2*(inc-300001);
			System.out.print("Total tax paid is "+ tax);		
		}
		else {
			tax=0.3*(inc-500001);
			System.out.print("Total tax paid is "+ tax);
		}
	}
}
