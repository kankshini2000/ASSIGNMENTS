package java_program;
import java.util.*;
public class cui {

	public static void main(String[] args) throws Exception{
		String user,pswd;
		Scanner obj=new Scanner(System.in);
		int cnt=0;
		while(cnt<=2) {
			System.out.print("enter Userid:");
			user=obj.nextLine();
			System.out.print("enter pswd:");
			pswd=obj.nextLine();
			if((user.equals("Ajay")) && (pswd.equals("password"))) {
				System.out.println("Welcome");
			}
			else {
				System.out.println("You have entered wrong credentials ,please enter the right credentials.");
			}
			cnt++;
			if(cnt>2) {
				System.out.println("Contact admin");
			}
			//obj.close();
		}
	}
}
