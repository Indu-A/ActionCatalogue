package assignment1.Action.sec313;
	
	
	/**
	 * This is the Abstract Action Superclass that provides a catalog of 
	 * actions to be carried out in view of COVID-19 OPH protocols.
	 * String variable description is declared.
	 * @author indup
	*/
	public abstract class Action
	{
		private String description;
	
	/**
	   Constructs an action without a description.
	*/
		public Action()
		{
		   description = "";
		}
		
		/**
		   Sets the description of this action.
		   @param description the text description of the action
		*/
		public void setDescription(String description)
		{
		   this.description = description;
		}
		
		/**
		   Abstract method to define the action activity occurance on required subclasses.
		   @param year the year
		   @param month the month
		   @param day the day
		   @return true if the action activity occurs on the specified date.
		*/
		public abstract boolean occursOn(int year, int month, int day);
		
		/**
		   Converts action activity to string description.
		*/
		public String toString()
		{
		   return description;
		}
	}

