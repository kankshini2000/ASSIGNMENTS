package java_program;
import java.util.*;
public class marks {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int n,m1,m2,m3;
		System.out.print("Enter how many stds:");
		n=obj.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter std " +(i+1) + "marks1:");
			m1=obj.nextInt();
			System.out.print("Enter std " +(i+1) +" marks2:");
			m2=obj.nextInt();
			System.out.print("Enter std " +(i+1) +" marks3:");
			m3=obj.nextInt();
			//obj.close();
			if((m1+m2+m3)>60) {
				System.out.println("Passed");
			}
			else if (((m1+m2)|(m2+m3)|(m3+m1))> 60) {
				System.out.println("promoted");
			}
			else {
				System.out.println("Failed");
			}
		}

	}
}
