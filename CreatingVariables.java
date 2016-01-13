public class CreatingVariables {
	public static void main( String [] args ) {
		int x, y, age, z;
		double seconds, e, checking, temperature;
		String firstName, lastName, title, bankName, carColor;
		
		x = 10;
		y = 400;
		age = 39;
		z = 1000;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		temperature = 98.6;
		
		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		bankName = "USAA";
		carColor = "red";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println();
		System.out.println( "Right now I wish I had $" + z + " in my hands." );
		System.out.println( "I currently bank with " + bankName + "." );
		System.out.println( "My favorite color car is " + carColor + "." );
		System.out.println( "A normal body temperature is " + temperature + "." );
		
	}
}