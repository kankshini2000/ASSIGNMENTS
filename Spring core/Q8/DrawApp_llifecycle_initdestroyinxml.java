package springcore_example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp_llifecycle_initdestroyinxml {
	public static AbstractApplicationContext context;
	public static void main(String[] args) {
		context=new  ClassPathXmlApplicationContext("spring_initdestroy_lifecycle.xml");
		context.registerShutdownHook();
		Circle_initdestroy_lifecycle  circle=(Circle_initdestroy_lifecycle) context.getBean("circle");
		//os here we have passed circle1 why is that 
		//as in teh springbean.xml the cirlc1 has all the three pts even though in the circle1 has ptB,ptC
		circle.draw();	
	}
}
