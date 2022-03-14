package java_program;
import java.util.ArrayList;
class Manager extends assignment2q2 {
	@Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}
class Labour extends assignment2q2 {
	@Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}
public class assignment2q2 {
	static int salary = 10000;
	static int sum=0;
	public int getSalary(int salary){
		return salary;
	}
	public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
		for(int i=0;i<employeeSalaries.size()-1;i++) {
			sum+=employeeSalaries.get(i);
		}
		return sum;
	}
	public static void main(String[] args) {
		ArrayList<Integer> employeeSalaries =new ArrayList<>();
		Manager m1=new Manager();
		Labour l1=new Labour();
		employeeSalaries.add(m1.getSalary(salary));
		employeeSalaries.add(l1.getSalary(salary));
		System.out.println(totalEmployeesSalary(employeeSalaries));
	}

}
