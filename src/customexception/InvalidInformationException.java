//-----------------------------------------------------------------------------------------------------------------------------------------
	package customexception;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create exceptions where the user enter wrong information
	 */
	public class InvalidInformationException extends Exception{
		
		private String report;
		private int number;
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		
		public InvalidInformationException(String r,int n) {
			report = r;
			number = n;
			
		}
 //----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns a personalized message for every considered exception case
		 */
		public String getMessage() {
			
			String mssg = "";
			
			if(report.equals(null) || report.equals("")) {
				mssg += " You cannot create a new quick access bar if you havent enter enough information ";
			}
			if(number<0 || number>64) {
				mssg += "You cannot create a new quick access bar with these values (only from 1 to 64 is allowed)";
			}
			
			return mssg;
		}
//-----------------------------------------------------------------------------------------------------------------------------------------	
}
