package assignment1.Action.sec313;

import java.util.Scanner;

/**
 * This is the program to test the OccasionalAction class and RareAction class, 
 * subclasses of the Abstract Class Action. This class contains the main method to run the code
 * @author indup
 *
 */
public class ActionDriver2 {
	
	/**
	 * This is the entry point of the program.
	 * Integer variables are declared to hold month, year and date values. A String variable is initialised
	 * to hold the description to give to the RareAction object and OccasionalAction object.
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		String description = "";
		int year=0;
		int month=0;
		int day=0;
		
		/*
		 * Instanciating RareAction class object to hold an empty descrition, 
		 * a day and a month value and OccasionalAction class objects to hold 
		 * an empty string and a day.
		 */
		RareAction rareAction = new RareAction(description,month,day);
		OccasionalAction oAction = new OccasionalAction(description,day);
		
		
		/*initialising scanner object to get user input*/
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * Instanciating Class objects to have the runtimeclass of rareAction,
		 * and oAction objects
		 */
		Class rareActionClass = rareAction.getClass();
		Class oActionClass = oAction.getClass();
		
		/*
		 * following logic checks if the rare action class is a subclass of class Action
		 * and displays the output as true or false
		 */
		System.out.printf("%s","RareAction is just a subclass of Action: ");
		
		if (rareActionClass.getSuperclass() == Action.class)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("Expected: true");
		
		/*
		 * following logic checks if the occasional action class is a subclass of class Action
		 * and displays the output as true or false
		 */
		System.out.printf("%s","OccasionalAction is just a subclass of Action: ");
		
		if (oActionClass.getSuperclass() == Action.class)
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println("Expected: true");
		
		/*
		 * Following logic checks if OccasionalAction calss is having one extra field and displays
		 * the output as true or false.
		 */
		System.out.printf("%n%s","OccasionalAction activities have no extra fields: ");
		
		if (oActionClass.getDeclaredFields().length==1)
			System.out.println("true");
		else
			System.out.println("false");
		/*Displays the expected result of the comparison */
		System.out.println("Expected: true");
		/*
		 * Following logic checks if RareAction class is having two extra fields and displays
		 * the output as true or false.
		 */
		System.out.printf("%s","RareAction activities have no extra fields: ");
		
		if (rareActionClass.getDeclaredFields().length==2)
			System.out.println("true");
		else
			System.out.println("false");
		/*Displays the expected result of the comparison */
		System.out.println("Expected: true");
		
		/*
		 *  following logic displays the occasional action activities occurance
		 *  after instanciating OccasionalAction object to hold an occasional activity
		 */
		System.out.printf("%n%s","Looking at Occasional actions: ");
				
		/*Instanciating new OccasoinalAction object to hold the occasional activity*/
		OccasionalAction oAction1 = new OccasionalAction("Take a PCR test", 22);
		
		System.out.printf("%nExpected: %s%n%s%n",oAction1.toString(), oAction1.occursOn(2022,06,22));
		System.out.println("Expected: true");
		
		/*
		 *  following logic displays the Rare action activities occurance
		 *  after instanciating RareAction object to hold a Rare activity
		 */
		System.out.printf("%n%s","Looking at Rare actions: ");
		
		/* Instanciating new RareAction object to hold the occasional action*/
		RareAction rareAction1 = new RareAction("Take a booster dose",07,06);
		
		System.out.printf("%nExpected: %s%n%s%n",rareAction1.toString(), rareAction1.occursOn(2022,07,06));
		System.out.println("Expected: true");

	}

}
