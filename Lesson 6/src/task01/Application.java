package task01;

public class Application {

	public static void main(String[] args) {

		HourEmployee hour = new HourEmployee("Alex", 28.8, 180);
		FixedEmployee fixed = new FixedEmployee("Bob", 5000);

		hour.salary();
		fixed.salary();
	}

}