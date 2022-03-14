package springcore_example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Circle_initdestroy_lifecycle implements InitializingBean,DisposableBean{
	private Point_initdestrroy_lifecycle ptA;
	private Point_initdestrroy_lifecycle ptB;
	private Point_initdestrroy_lifecycle ptC;
	
	
	
	public Point_initdestrroy_lifecycle getPtA() {
		return ptA;
	}



	public void setPtA(Point_initdestrroy_lifecycle ptA) {
		this.ptA = ptA;
	}



	public Point_initdestrroy_lifecycle getPtB() {
		return ptB;
	}



	public void setPtB(Point_initdestrroy_lifecycle ptB) {
		this.ptB = ptB;
	}



	public Point_initdestrroy_lifecycle getPtC() {
		return ptC;
	}



	public void setPtC(Point_initdestrroy_lifecycle ptC) {
		this.ptC = ptC;
	}



	public void draw() {
		System.out.println("circle is drawn");
		System.out.println("Pint A= {" +getPtA().getX() +", "+getPtA().getY() + ")");
		System.out.println("Pint B= {" +getPtB().getX() +", "+getPtB().getY() + ")");
		System.out.println("Pint C= {" +getPtC().getX() +", "+getPtC().getY() + ")");
	}
	
	public void myInit() {
		System.out.println("init method is called for circle_desory");
	}
	
	public void Destroy() {
		System.out.println("destory method is called for circle_desory");
	}



	public void afterPropertiesSet() throws Exception {
		System.out.println("initialzing method is called for circle");
		
	}

	public void destroy() throws Exception {
		System.out.println("disposable method is called for circle");
		
	}
}
