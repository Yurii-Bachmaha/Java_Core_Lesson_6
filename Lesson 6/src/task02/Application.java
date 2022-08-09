package task02;

public class Application {

	public static void main(String[] args) {

		double a = 9.5;
		double b = 2.8;

		MyCalculator calc = new MyCalculator();

		System.out.println("The result of addition a and b is : " +calc.plus(a, b));
		System.out.println("The result of subtraction a and b is : " +calc.minus(a, b));
		System.out.println("The result of multiplication a and b is : " +calc.multiply(a, b));
		if(b!=0) {
			System.out.println("The result of division a and b is : " +calc.devide(a, b));
		}else {
			System.out.println("You can't divide a number by 0");
		}
	}

}