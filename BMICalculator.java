import java.util.Scanner;

public class BMICalculator {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double ft, inches, weight, bmi;
		
		System.out.print( "Your height (feet only): " );
		ft = keyboard.nextDouble();
		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();
		
		System.out.print( "Your weight in pounds: " );
		weight = keyboard.nextDouble();
		
		bmi = weight / ((ft*12+inches)*(ft*12+inches)) * 703;
		
		System.out.println( "Your BMI is " + bmi );
	}
}
		