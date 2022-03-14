package lamda;
import java.util.function.*;
interface say{
	String say(String msg);
}
public class assign3 {
	public static void main(String[] args) {
		//Supplier-> means only supply data as we have used getmethod
		Supplier<String> str1=() -> "hema";
		System.out.println("----this is supplier functinal interface---");
		System.out.println(str1.get());
		//Predicate->boolean result
		System.out.println("----this is predicate functinal interface---");
		Predicate<Integer> pr=a-> (a>18);
		boolean greater=pr.test(17);
		System.out.println("sorry you cant vote as the age should be above 18 :"+ greater );
		//Consumer-> consumes date no o/p is send
		System.out.println("----this is consumer functinal interface---");
		Consumer<String> cr=s->System.out.println(s);
		 cr.accept("Consumer problem!");
		//Function-> if provided input output also comes
		 System.out.println("----this is functinal interface---");
		 say s1=new say() {
			 public String say(String msg) {
				 return msg;
			 }
		 }; 
		 System.out.println("Msg diaplyed is: "+s1.say("Hello!"));
	}
}
