package java_program;
import java.util.*;
public class array {
	//public int instanceVar;
	public static void main(String[] args) {
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.print("enter size of array : ");
		n=obj.nextInt();
		obj.close();
		int arr[]=new int[n];
		System.out.print("enter i/ps in array : ");
		for(int i=0;i<n;i++) {
			arr[i]=obj.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array ele :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
