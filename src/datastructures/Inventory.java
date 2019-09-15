//-----------------------------------------------------------------------------------------------------------------------------------------	
	package datastructures;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create the main inventary where the user is going to stored
	 * all their desired blocks
	 */
	public class Inventory<Key, Value> implements Iinventory<Key,Value>{
		public static final int INVENTORY_SIZE = 27;
		public static final double a = ((Math.sqrt(5) - 1)/2);
		
		private Hblock<Key, Value>[] inventory;
//-----------------------------------------------------------------------------------------------------------------------------------------	
		@SuppressWarnings("unchecked")
		/**
		 * <b>Inventary Constructor</b>
		 * This method allows to create inventaries for the game.
		 */
		public Inventory() {
			inventory = new Hblock[INVENTORY_SIZE];
			for(int i = 0; i < INVENTORY_SIZE; i++) {
				inventory[i] = null;
			}
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * This method returns the hash table that contains the blocks stored by the user
		 * <b>Pre:</b> The inventary exists
		 * @return the hash table
		 */
		public Hblock<Key, Value>[] getInventary(){
			return inventory;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method allows to obtain a value by a given key.
		 * <b>Pre:</b> the inventary exists
		 * <b>Pos:</b> the value for the current key is returned.
		 * @param key the key for the element
		 * @return the value for this block
		 */
		public Value getValue(Key key) {
			
			if(key == null) {
				return null;
			}else {
				
				int index = hash1(key);
				Hblock<Key,Value> block = inventory[index];
				
				if(block == null) {
					return null;
				}
				else {
					while(block!=null) {
						if(block.getKey().equals(key)) {
							return block.getValue();
						}
						block = block.getNext();
					}
				}
				
			}
			return null;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method allows to search for a value in the hash table.
		 * <b>Pre:</b> The inventory exists;
		 * <b>Pos:</b> The 
		 * @param key the key for the node that is going to be search
		 * @return the node that correspond to the given key.
		 */
		public Value searchValue(Key key) {
			Value item = getValue(key);
			if(item == null) {
				return null;
			}
			else {
				return item;
			}
		}		
	//-----------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method allows to insert a new element into the inventory hash table
		 * <b>Pre:</b> the inventory exists
		 * <b>Pos:</b> the node is inserted in the right position by chainning alternative
		 * @param block the block that is going to be insert on this hash
		 */
		public void insert(Key key, Value value) {
			int index = hash1(key);
			Hblock<Key,Value> block = inventory[index];
			
			if(block==null) {
				inventory[index] = new Hblock<>(key, value);
			}
			else {
				while(block!=null) {
					if(block.getKey().equals(key)) {
						block.setNext(new Hblock<>(key,value));
					}
					block = block.getNext();
				}
			}
		}
	//------------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method represents the hash function that are going to allow insert an element
		 * <b>Pre:</b> The inventary exists
		 * <b>Pos:</b> The right index for this element is inserted.
		 * @param key the key for the node that are going to be insert
		 * @return the index for the current node that is going to represent its position on the hash table
		 */
		public int hash1(Key key) {
			int index = key.hashCode() % INVENTORY_SIZE;
			return index;
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------
}