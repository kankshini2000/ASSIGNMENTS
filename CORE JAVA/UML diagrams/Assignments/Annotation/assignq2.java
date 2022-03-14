import java.lang.annotation.*;
@Target(ElementType.TYPE) 
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int auth_id();
	String date();
	String time();
	int version();
}
@Info(auth_id=1,date="21-02-2022",time="13:00",version=4)
class value1{
	String name;
	public value1(String name) {
		super();
		this.name = name;
	}
	void disaply() {
		System.out.println("The details of the people are:");
		System.out.println(name+" ");
	}
}
public class assignq2 {
	public static void main(String[] args) {
		value1 v2=new value1("Neha");
		v2.disaply();
		System.out.println("---------------");
		Class c=v2.getClass();
		Annotation an=c.getDeclaredAnnotation(Info.class);
		Info info=(Info) an;
		System.out.println("Auth id: "+info.auth_id()+" Date: " +info.date()+
				" Time: "+info.time()+" Version: "+info.version());
	}
}
