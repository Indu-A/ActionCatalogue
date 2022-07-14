package assignment1.Action.sec313;

/**
 * This is a subclass, of Abstract Class Action, named OccasionalAction.
 * OccasionalAction class activities are activities that occur on the same day of every month specified.
 * 
*/
public class OccasionalAction extends Action {
	
	private int day;
   
	/**
	 * Constructs Occasional Action with a given description and day.
	 * @param description description of the activity
	 * @param day day of the month
	 */
	public OccasionalAction(String description, int day) {
		
		super.setDescription(description);
		this.day = day;
		
		}
	/**
	 * Determines if this action occurs on the specified date.
	 * @param year year of the activity occurance
	 * @param month month of activity occurance
	 * @param day day of the month
	 * @return true if the action activity occurs on the specified date.
	 */
	public boolean occursOn(int year, int month, int day) {
		
		boolean action = false;
		
		if (this.day==day)
			action = true;
		
		return action;
	}
	
		

}
