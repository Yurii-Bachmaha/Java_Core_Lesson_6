package task01;

public class HourEmployee implements Salary {

	private String name;
	private double hourSalary;
	static int hourPerMonth;
	private double salary;

	public HourEmployee(String name, double hourSalary, int hourPerMonth) {
		super();
		this.name = name;
		this.hourSalary = hourSalary;
		HourEmployee.hourPerMonth = hourPerMonth;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHourSalary() {
		return hourSalary;
	}

	public void setHourSalary(double hourSalary) {
		this.hourSalary = hourSalary;
	}

	public int getHourPerMonth() {
		return hourPerMonth;
	}

	public void setHourPerMonth(int hourPerMonth) {
		HourEmployee.hourPerMonth = hourPerMonth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void salary() {
		this.salary = this.hourSalary * HourEmployee.hourPerMonth;
		System.out.println("My name is " + this.name + " my monthly salary is " + this.salary + "$");
	}

}