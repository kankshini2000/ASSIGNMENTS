import java.util.*;  
public class assign7q3 {
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		Employee emp1 = new Employee("Balu", 10, 40000,"CSE");
        Employee emp2 = new Employee("Ajay", 20, 80000,"ECE");
        Employee emp3 = new Employee("Carol", 30, 150000,"MECH");
        Employee emp4 = new Employee("John", 40, 50000,"ESE");
        Employee emp5 = new Employee("Hema", 50, 90000,"IT");
        Employee emp6 = new Employee("Neha", 60, 160000,"MBA");
        Employee emp7 = new Employee("David", 70, 20000,"AI");
        Employee emp8 = new Employee("Shiro", 80, 30000,"CIVIL");
        Employee emp9 = new Employee("Sana", 90, 170000,"MECH");
        Employee emp10 = new Employee("Peter", 95, 50000,"MB");
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);
        treeSet.add(emp6);
        treeSet.add(emp7);
        treeSet.add(emp8);
        treeSet.add(emp9);
        treeSet.add(emp10);
        System.out.println("treeSet : " + treeSet + "\n");
        for( Employee employee : treeSet )
        {
            System.out.println("Employee Name : "+employee.getName());
            System.out.println("Employee Age : "+employee.getAge());
            System.out.println("Employee Salary :"+ employee.getSalary());
            System.out.println("Employee Dept :"+ employee.getDept());
            System.out.println("--------------------------------------------");
        }
	}
}
