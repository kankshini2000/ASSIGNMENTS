package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppq2 {
	public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("assign2.xml");

        // calling list of answer
        Collectiosnq2 c1 =(Collectiosnq2)context.getBean("que");
       c1.displaylist();

       // calling set of answer
        System.out.println("=====================================");
        Collectiosnq2 c2 =(Collectiosnq2)context.getBean("que1");
        c2.displaySet();

        // calling map of answer
        System.out.println("=====================================");
        Collectiosnq2 c3 =(Collectiosnq2)context.getBean("que2");
        c3.displayMap();

    }
}
