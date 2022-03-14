package springcore_example;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Studnetq5 {
	String name;
	int age;
	public Schoolq5 school;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Schoolq5 getSchool() {
		return school;
	}
	@Resource(name="schools")
	public void setSchool(Schoolq5 school) {
		this.school = school;
	}
	
    public void getstds(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
    }

    public void getstdsResource(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("School: "+school.getName());
        System.out.println("Total Students: "+school.getTot());
    }
}
