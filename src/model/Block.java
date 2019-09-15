//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create blocks for buildings and constructions.
	 */
	public class Block {
		
		public final static String DIAMOND = "D";
		public final static String STONE = "S";
		public final static String GRASS = "G";
		public final static String WOODEN = "W";
		public final static String SAND = "A";
		public final static String GOLD = "O";
		public final static String GLOWSTONE = "T";
		public final static String CORAL = "C";
	
		private String type;		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		public Block(String t) {
			type = t;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------	
		public String getType() {
			return type;
		}
//-----------------------------------------------------------------------------------------------------------------------------------------
}