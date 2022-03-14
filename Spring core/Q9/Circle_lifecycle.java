package springcore_example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//how to configure initmethod n destroy method in the beans
//2 methods needs to be called 1st to initialize n 2nd to destroy bean
public class Circle_lifecycle implements InitializingBean,DisposableBean{
	//here InitializingBean is a marker for the  bean to know that a mthod of the circle_lifecycle bean needs to be called after initialization

	//here we r initializing bean by implementing Initialzingbean interface
	//so here we r tellin gspring that Circl_lifecycle bean needs to be called when bean is initialized 
	private Point_lifecycle ptA;
	private Point_lifecycle ptB;
	private Point_lifecycle ptC;
	public Point_lifecycle getPtA() {
		return ptA;
	}
	public void setPtA(Point_lifecycle ptA) {
		this.ptA = ptA;
	}
	public Point_lifecycle getPtB() {
		return ptB;
	}
	public void setPtB(Point_lifecycle ptB) {
		this.ptB = ptB;
	}
	public Point_lifecycle getPtC() {
		return ptC;
	}
	public void setPtC(Point_lifecycle ptC) {
		this.ptC = ptC;
	}
	public void draw() {
		System.out.println("circle is drawn");
		System.out.println("Pint A= {" +getPtA().getX() +", "+getPtA().getY() + ")");
		System.out.println("Pint B= {" +getPtB().getX() +", "+getPtB().getY() + ")");
		System.out.println("Pint C= {" +getPtC().getX() +", "+getPtC().getY() + ")");
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialize init method is called for circle_lifecycle");
	}
	public void destroy() throws Exception {
		System.out.println("Disposable/destroy method is called for circle_lifecycle");
		
	}
}
