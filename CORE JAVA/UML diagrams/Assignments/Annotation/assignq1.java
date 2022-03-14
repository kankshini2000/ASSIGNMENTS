import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE) 
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	int num();
}
@Test(num=4)
class value{
	static String clg;//static varible
	String name;//non static varible
	public value(String name) {
		super();
		this.name = name;
	}
	void show() {
		System.out.println(name+" "+clg);
	}
}
public class assignq1 {
	public static void main(String[] args) {
		value.clg="TIS";
		//here as it is static method we can direclty access the method in class
		//here string is an instance varibles hence we need to create an object i.e v1
		value v1=new value("neha");
		v1.show();
		Class c=v1.getClass();
		Annotation an=c.getDeclaredAnnotation(Test.class);
		Test t=(Test) an;
		System.out.println("Test interface: "+t.num());
	}
}
