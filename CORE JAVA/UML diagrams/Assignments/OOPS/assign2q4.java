package oops_prpgrams;
abstract class name {
    String name;
    name(String name){
        this.name =name;
    }
    public  abstract String getname();
}
class person extends name{
    person(String name) {
        super(name);
    }
    @Override
    public  String getname(){
        return ("Hello,"+this.name);
    }
}
 abstract class MyClass {
    public abstract void display();
}
class  abstclass3 extends MyClass{
    @Override
    public void display(){
        System.out.println("subclass implementation for display method ");
    }
}
abstract class MyClass2 {
    public abstract void display2();
}
class abstclass4 extends MyClass2{
    public void display2(){
        System.out.println("not a Private Class ");
    }
}
abstract class MyClass3 {
    public void display3(){
        System.out.println("abstract class w/o abstract method");
    }
}
class abstclass6 extends MyClass3{
	
}
public class assign2q4 {
	public static void main(String[] args) {
        person user1 = new person("Neha");
        System.out.println(user1.getname());
        new abstclass3().display();
        new abstclass4().display2();
        new abstclass6().display3();
    }
}
