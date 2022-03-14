package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPpq3 {
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("assign3.xml");

        Bankconttolq3 controller = (Bankconttolq3)context.getBean("controller");


        System.out.println(controller.getBalance(1000));
        System.out.println(controller.deposit(1000,2000));
        System.out.println(controller.withdraw(1000,2000));
        System.out.println(controller.getBalance(1000));
        System.out.println(controller.fundTransfer(1000,1001,5000));
        System.out.println(controller.getBalance(1000));
        System.out.println(controller.getBalance(1000));


    }
}
