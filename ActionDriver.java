package assignment1.Action.sec313;
import java.lang.reflect.*;
import java.util.*;

/**
 *
 * This is the program to test the RegularAction class, subclass of the Abstract Class Action.
 * This class contains the main method to run the code.
 * @author indup
 *
 */
public class ActionDriver {
	/**
	 * This is the entry point of the program.
	 * A String variable is initialised to hold the description to give
	 *  to the RegularAction object.
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		String description = "";
		/*
		 * Instanciating RegularAction class object to hold an empty string.
		 */
		RegularAction rAction = new RegularAction(description);
		
		Scanner keyboard = new Scanner(System.in);
		
		/* 
		 * initialising Class objects to have the runtimeclass of rareAction,
		 * and oAction objects 
		 * */
		Class rActionClass = rAction.getClass();
		
		/*
		 * following logic checks if RegularAction is a subclass of Action superclass.
		 */
		System.out.printf("%s","RegularAction is just a subclass of Action: ");
		
		if (rActionClass.getSuperclass() == Action.class)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("Expected: true");
		
		/*
		 * following logic checks if RegularAction has any extra fields
		 */
		System.out.printf("%s","RegularAction activities have no extra fields: ");
		
		if (rActionClass.getDeclaredFields().length==0)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("Expected: true");
		
		
		/*
		 *  following logic checks and displays the regular action activities occurance
		 */
		System.out.printf("%s","looking at regular actions: ");
		description = keyboard.nextLine();
		
		// Instanciating new RareAction object to hold the user input
		RegularAction rAction1 = new RegularAction(description);
		
		System.out.printf("Expected: %s%n",rAction1.toString());
		System.out.printf("%s%n",rAction1.occursOn(2022,01,02));
		System.out.println("Expected: true");
		
	
	}

}
