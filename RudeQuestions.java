import java.util.Scanner;

public class RudeQuestions {
	public static void main( String [] args ) {
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );
		
		String birthplace;
		
		System.out.print( "One more question. Where were you born? " );
		birthplace = keyboard.next();
		System.out.println( birthplace + ", how awesome is that?! Thanks for letting me know." );
		 
				
		/* 1. No, because a floating can hold whole and fractional numbers.
		   2. No, because a string can hold characters, including numbers.
		   3. I could not get question one to blow up. However age blew up using a
		      floating point value. Weight and Income blew up using non-numerical
		      characters. */
	}
}