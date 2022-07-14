package assignment1.Action.sec313;
import java.util.Scanner;

/**
 * The purpose of this class is to demonstrate the Action class and subclasses.
 * This class contains main method to drive the code.
 * An array of Action objects are initialised with different action activities. 
 * A user inputs a date of their choice and displays an output of all activities that would occur on that date.
*/

public class AllActionTest {
	/**
	 * This is the entry point of the program. 
	 * An array of Action objects are initialised with regular, occasional and rare action activities.
	 * Integer variables are declared to hold month, year and date values through the user input
	 * A string array to convert the user input of date in the format "YYYY MM DD" 
	 * @param args Command line arguments are not used by this program.
	 */
	public static void main(String[] args) {
		
		Action [] actions = new Action[5];
		actions[0] = new RegularAction("Wash your Hands");
		actions[1] = new OccasionalAction("Take a PCR Test",03);
		actions[2] = new OccasionalAction("Sit two meters apart", 19);
		actions[3] = new OccasionalAction("Wear a mask",07);
		actions[4] = new RareAction("Get a booster shot", 12,07);

		Scanner keyboard = new Scanner(System.in);
		
		int day;
		int month;
		int year;
		String [] date = new String[3];
		
		//prompting user to input a date in the format YYY MM DD
		System.out.println("Enter a date (like 2018 01 30)");
		//Stores the date information string to String array
		date = keyboard.nextLine().split("\\s");
		
		//Assigning the year, month and date values from the string to corresponding Integer variables.
		year = Integer.parseInt(date[0]);
		month = Integer.parseInt(date[1]);
		day = Integer.parseInt(date[2]);
		

		System.out.printf("%s%s/%s/%s%s%n","These are your actions on ",date[1],date[2],date[0],":");
		/*
		 * Following logic displays the actions corresponding to the user entered date by 
		 * checking the return value of the method Actions.occursOn().
		 */
		
		for (Action act : actions)
		{
			if (act.occursOn(year,month,day))
				System.out.println(act.toString());
		}
		
		keyboard.close();
   }
}
