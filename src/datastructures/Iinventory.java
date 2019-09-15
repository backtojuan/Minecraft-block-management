//-----------------------------------------------------------------------------------------------------------------------------------------
	package datastructures;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This Interface has the methods that are going to be implemented with the hash blocks
	 */
	public interface Iinventory<Key, Value> {
		
		/**
		 * This method allows to the inventory returns the Hblock value assigned to a key
		 * @param key the key given to search for a Hblock
		 * @return the Hblock searched
		 */
		public Value getValue(Key key);
//-----------------------------------------------------------------------------------------------------------------------------------------
}