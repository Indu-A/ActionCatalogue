package assignment1.Action.sec313;

/**
 * 
 * This is a subclass, of Abstract Class Action, named RareAction.
 * Activities for RareAction occurs on a particular day in an year specified.
 * 
 */
public class RareAction extends Action {
   
	private int day;;
	private int month;
	
	   
	/**
	 * Constructs Rare Action with a given description, day, month and year.
	 * @param description description of the activity
	 * @param month month of activity occurance
	 * @param day day of the month
	 */
	public RareAction(String description, int month, int day) {

		super.setDescription(description);
		this.day = day;
		this.month = month;
		
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
		
		if ((this.day==day) && (this.month==month))
			action = true;
		
		return action;
	}

}
