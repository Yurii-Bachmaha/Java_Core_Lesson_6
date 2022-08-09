package task01;

public class FixedEmployee implements Salary {

	private String name;
	private int salary;

	public FixedEmployee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void salary() {
		System.out.println("My name is " + this.name + " My monthly salary is " + this.salary + "$");
	}

}