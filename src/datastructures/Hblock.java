//-----------------------------------------------------------------------------------------------------------------------------------------
	package datastructures;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create blocks as hash objects with values
	 */
	public class Hblock<Key, Value>{
		private Key k;
		private Value v;
		
		private Hblock<Key,Value> next;
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/**
		 * <b>Hblock Constructor</b>
		 * This method allows to create objects of type Hblock
		 * @param k the key represented for this Hblock (amount of elements contained)
		 * @param v the value represented for this Hblock (The block store with the amount represented for the key)
		 */
		public Hblock(Key k, Value v) {
			this.k = k;
			this.v = v;
			next = null;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method sets the value object for a HBlock
		 * <b>Pre:<b> The Hblock exists
		 * <b>Pos:</b> The value for this Hblock was set
		 * @param value the new value for this Hblock
		 */
		public void setValue(Value value) {
			v = value;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the associated value for this Hblock represented by the block previously picked
		 * <b>Pre:</b> The Hblock exists
		 * @return the associated value for this Hblock 
		 */
		public Value getValue() {
			return v;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the associated key for this Hblock represented by the amount of blocks
		 * <b>Pre:</b> The Hblock exists
		 * @return the associated key for this Hblock
		 */
		public Key getKey() {
			return k;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method gets the next association for this Hblock in the case where collisions were resolved with chainning in the past
		 * so they had the same key value.
		 * @return the next element with the same key but with different value.
		 */
		public Hblock<Key, Value> getNext(){
			return next;
		}
	//-------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method sets the next association for this Hblock in the case where a collision is presented and two
		 * elements has the same key, resolved by chainning it with the current Hblock with the equal key 
		 * @param n the next element with the same key but with different value.
		 */
		public void setNext(Hblock<Key,Value> n) {
			next = n;
		}
//-----------------------------------------------------------------------------------------------------------------------------------------		
}
