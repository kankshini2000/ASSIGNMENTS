package oops_prpgrams;
class SingletonInheritanceCheck{
	private static  SingletonInheritanceCheck singletonInheritanceCheck = null;
    private SingletonInheritanceCheck(){} //constructor
    public static SingletonInheritanceCheck getSingleton()
    {
        if(singletonInheritanceCheck==null) 
        {
            singletonInheritanceCheck = new SingletonInheritanceCheck();
        }
        return singletonInheritanceCheck;
    }

}
public class assign2q1 {

	public static void main(String[] args) {
		SingletonInheritanceCheck singletonInheritanceCheck = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck);
        SingletonInheritanceCheck singletonInheritanceCheck1 = SingletonInheritanceCheck.getSingleton();
        System.out.println(singletonInheritanceCheck1);
	}

}
