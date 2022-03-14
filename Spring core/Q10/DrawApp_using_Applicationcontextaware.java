package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawApp_using_Applicationcontextaware {
	public static ApplicationContext context;
	public static void main(String[] args) {
		//here the context is initialized only once pass spring_app.xml only once
		context=new  ClassPathXmlApplicationContext("Spring_applicationcontextaware.xml");
		Circle_using_Applicationcontextaware  circle=(Circle_using_Applicationcontextaware ) context.getBean("circle");
		circle.draw();
		
	}
}
