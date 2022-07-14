package assignment1.Action.sec313;

/**
 * This is a subclass of the Action Superclass.
 * Action has a description (for example, "Wash your hands") and 
 * occurss on one or more dates.
 * A regularaction activity occurs every day.
*/
public class RegularAction extends Action {
	
	
	/**
	 * Constructs Regular Action with a given description.
	 * @param description description of the activity
	 */
	public RegularAction(String description) {

	super.setDescription(description);
	
	}
	/**
	   Determines if this action occurs on the specified date.
	   @param year the year
	   @param month the month
	   @param day the day
	   @return true if the action activity occurs on the specified date.
	*/	
	public boolean occursOn(int year, int month, int day) {
		
		boolean action = true;
		
		return action;
	}

}
