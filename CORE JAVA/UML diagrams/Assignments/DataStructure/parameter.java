package java_program;
class circle{
	int rad;
	int cir;
	public void area() {
		cir=(int)(2*3*rad);
		System.out.println("Area printed is :"+cir);
	}
	circle(int rad){
		this.rad=rad;
	}
	
}
public class parameter {

	public static void main(String[] args) {
		circle c1=new circle(4);
		c1.area();
	}

}
