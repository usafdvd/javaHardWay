import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String [] args ) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ready;
		
		System.out.print("Give me a number, and I'll find its square root.\n ");
		System.out.print("Are you ready?? Type 'YES!' to proceed! ");
		ready = keyboard.nextLine();
		
		while ( ! ready.equalsIgnoreCase("yes!")) {
			System.out.print("Well, are you ready now?? ");
			ready = keyboard.nextLine();
		}
		
		System.out.print("Alright, give me that number. No negatives, please. ");
		x = keyboard.nextDouble();
		
		while (x < 0) {
			System.out.println("I won't take the square root of a negative.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}
		
		y = Math.sqrt(x);
		
		System.out.println("the square root of "+x+" is "+y);
	}
}