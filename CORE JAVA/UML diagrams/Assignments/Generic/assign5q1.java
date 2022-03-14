package generic;
import java.util.HashSet;
import java.util.Set;
class Employee{
	private int id,salary;
	private String name,department;
	
	public Employee(int id, String name,int salary,String department){
		super();
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	public String toString() {
		return "{"+
	            "id =" + id +
                ",name='" + name + '\'' +
                ", sal=" + salary + '\''+
                ",department='" +department +
                '}';
	}
	public void displayDetails() {
		System.out.println("Details of the employee is : ");
	}
}
public class assign5q1 {

	public static void main(String[] args) {
		Set<Employee> employees=new HashSet<>();
		Employee e1=new Employee(1,"john",4000,"CSE");
		employees.add(e1);
		System.out.println(employees);	
	}
}
