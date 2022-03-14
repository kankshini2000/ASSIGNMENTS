package java_program;

class shape{
	public void area(String name) {
		System.out.println("diplay area : " + name);
	}
}

class triangle extends shape{
	public void area(int l,int h,String name) {
		System.out.println((int)(1*l*h)+name);
	}
}

class euqilateral extends triangle{
	public void area(int l,int h,String name) {
		System.out.println((int)(1/2*l*h));
	}
}

public class basic {
	public static void main(String[] args) {
		triangle t1=new triangle();
		t1.area(4,6,"traingle");
	}
}
