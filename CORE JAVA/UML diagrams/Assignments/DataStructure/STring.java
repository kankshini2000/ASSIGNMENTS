package java_program;

public class STring {

	public static void main(String[] args) {
		String str1="hi";
		String str2="hi";
		//we r not comapring contet
		//we r compaing hashcodes of str1 n str2
		if(str1==str2) {
			System.out.println("str1==str2");
		}
		else {
			System.out.println("str1!=str2");
		}
		//String obejct i.e new operstor
		//String object is constrcuted in heap area with hello as its ocntnen 
		String str3= new String("hello");
		String str4= new String("hello");
		//so here the o/p has shown to be diff as str3 n 4 are the refercne variables for the objects
		if(str3.equals(str4)) {
			System.out.println("str3 euals to str4");
		}
		else {
			System.out.println("str3 nto euals tostr4");
		}
		if(str3.compareTo(str4)==0) {
			System.out.println("str3 compared with str4");
		}
		else {
			System.out.println("str3 not comapred with str4");
		}
		String str="John,Jennie,Im,Imlie";
		int len=str.length();
		System.out.println("len is"+len);
		//strign are characters 
		System.out.println(str.charAt(7)+" |"+ str.charAt(len-6));
		String s1=str.toUpperCase();
		System.out.println("string to upper case : "+s1);
		
		if(str.contains("John")) {
			System.out.println("it contains");
		}
		String s2=str.substring(len);
	}

}
