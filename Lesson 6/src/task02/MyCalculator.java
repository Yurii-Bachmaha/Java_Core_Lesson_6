package task02;

public class MyCalculator implements Numerable {

	@Override
	public double plus(double a, double b) {
		return a + b;
	}

	@Override
	public double minus(double a, double b) {
		return a - b;
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double devide(double a, double b) {
		if (b!=0) {
			return a/b;
		}else {
			System.out.println("You can't divide a number by 0");
			return 0;
		}
		
	}

}
