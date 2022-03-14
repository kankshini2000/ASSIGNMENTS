package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainappq5 {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring5.xml");
        
        Studnetq5 stds= (Studnetq5)context.getBean("stds");
        stds.getstds();

        Studnetq5 std1 = (Studnetq5)context.getBean("std1");
        std1.getstdsResource();
    }
}
