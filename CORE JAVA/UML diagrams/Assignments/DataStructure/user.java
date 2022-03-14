package java_program;

public class user {
	public static void main(String[] args) {
		for(int i=100;i<=999;i++) {
			int check, rem, sum=0;
			check=i;
			while(check!=0) {
				rem=check%10;
				check=check/10;
				sum= (int)(sum+Math.pow(rem,3));
			}
			if(i==sum) {
				System.out.print( i +" ");
			}
		}
	}
}


