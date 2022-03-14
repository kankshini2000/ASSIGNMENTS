public class Employee implements Comparable<Object>{
	private String name;
    private int age;
    private int salary;
    private String dept;
    public Employee(String name, int age, int salary,String dept)
    {
        super();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.dept=dept;
    }
    
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	 public String toString()
	    {
	        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary+ ","
	        		+ " dept=" +dept 
	                + "]";
	    }
	@Override
	public int compareTo(Object object) {
		Employee employee = (Employee) object;
		//System.out.println("compared method to sort name in desc ");
		System.out.println(this.getName()
        + employee.getName() + "\n");
		return employee.getName().compareTo(this.getName());
	}

}
