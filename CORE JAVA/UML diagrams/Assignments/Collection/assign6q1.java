import java.util.Scanner;
public class assign6q1 {
	public static void main(String[] args) {
		int pramt,rate,tim;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the pramt : ");
		pramt=sc.nextInt();
		System.out.println("enter the rate : ");
		rate=sc.nextInt();
		System.out.println("enter the time : ");
		tim=sc.nextInt();
		double res=(pramt*rate*tim)/100;
		Abc obj=()-> System.out.println("Simple interest is: "+res);
		obj.show();
	}
}
