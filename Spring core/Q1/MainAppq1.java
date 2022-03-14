package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppq1 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("assign1.xml");

        // using the setter injection
		Custoemrq1 customerobj=(Custoemrq1) context.getBean("customer");
        customerobj.toString();

        // using constructor injection
        Custoemrq1 customerConobj=(Custoemrq1) context.getBean("customerCon");
        customerConobj.toString();

	}

}
