package springcore_example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//lets say we have defined the circle_appl as singlelton so 
//the beans(PtA,PtB) that circle_Appl is deoendent on if they happen to be prototypes
public class Circle_using_Applicationcontextaware implements ApplicationContextAware,BeanNameAware{
	//we want the beans ptA,B,C to be created newly everytime, that wont work as the dependency of the Circle_application
	//now as the Circle_app is singeleton the so ptA,B,C will also be created along with Circle_application when the conainter is loaded n will be initializd
	//so even though the ptA,B,C r defiend as prototypes in spring_app.xml they will be initialized only once as the parent Circle_app is singeleton 
	//if u wanna create new instances of ptA,B,C the we can use appcontext.getbean
	//so in order to get appcontext we r implementing the interface called
	private Pts_applicationaware ptA;
	private Pts_applicationaware ptB;
	private Pts_applicationaware ptC;
	private ApplicationContext context=null;
	
	public Pts_applicationaware getPtA() {
		return ptA;
	}

	public void setPtA(Pts_applicationaware ptA) {
		this.ptA = ptA;
	}


	public Pts_applicationaware getPtB() {
		return ptB;
	}

	public void setPtB(Pts_applicationaware ptB) {
		this.ptB = ptB;
	}


	public Pts_applicationaware getPtC() {
		return ptC;
	}


	public void setPtC(Pts_applicationaware ptC) {
		this.ptC = ptC;
	}



	public void draw() {
		System.out.println("circle is drawn");
		System.out.println("Pint A= {" +getPtA().getX() +", "+getPtA().getY() + ")");
		System.out.println("Pint B= {" +getPtB().getX() +", "+getPtB().getY() + ")");
		System.out.println("Pint C= {" +getPtC().getX() +", "+getPtC().getY() + ")");
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context=context;
		//so its gonna set the member varible here applicationcontext "context" to the context that spring has procied in the setApplicationaware(application aware context )
		
	}

	public void setBeanName(String beanname) {
		System.out.println("bean name is: "+beanname);
	}
}
