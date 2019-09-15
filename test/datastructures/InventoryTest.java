//--------------------------------------------------------------------------------------------------------------------------------------------
	package datastructures;
//--------------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
	
	import model.Block;
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to test the datastructure class Inventory
	 */
	public class InventoryTest {
	
		private Inventory<String, Hblock<Integer,Block>> i;
		private Block b1;
		
		//Scenaries
		private void setUpScenary1() {
			
		}
		private void setUpScenary2() {
			b1 = new Block("S");
		}
//--------------------------------------------------------------------------------------------------------------------------------------------
			@Test
			/**
			 * This method test the constructor of the datastructure class Inventory, 
			 * making sure an Inventory is right created with its expected values
			 */
			public void testInventory() {
				setUpScenary1();
				i = new Inventory<>();
				assertNotNull(i,"The inventory is null as not expected");
			}
	//--------------------------------------------------------------------------------------------------------------------------------------------
			@Test
			/**
			 * This method test the insert method of the class inventory, making sure that a required element 
			 * gets in the hash table structure.
			 */
			public void testInsert() {
				setUpScenary2();
				i = new Inventory<>();
				String key = "S";
				i.insert(key, new Hblock<Integer,Block>(24,b1));
				assertNotNull(i.getInventory(), "The inventary is null as not expected");
			}
	//--------------------------------------------------------------------------------------------------------------------------------------------		
			@Test
			/**
			 * This method test the get value method of the inventory, making sure that with a given key
			 * it is returned the expected associated value
			 */
			public void testGetValue() {
				setUpScenary2();
				i = new Inventory<>();
				assertEquals(null,i.getValue(null), "The value is not the expected one");
				assertEquals(null,i.getValue("S"), "The value is not the expected one");
				Hblock<Integer,Block> h;
				i.insert("S", h = new Hblock<Integer,Block>(24,b1));
				assertEquals(h,i.getValue("S"), "The value is not the expected one");
			}
	//--------------------------------------------------------------------------------------------------------------------------------------------
			@Test
			/**
			 * This method test the searching method of the inventory, making sure that with a given key
			 * it is return the expected associated element
			 */
			public void testSearch() {
				setUpScenary2();
				i = new Inventory<>();
				assertEquals(null,i.searchValue(null), "The value is not the expected one");
				assertEquals(null,i.searchValue("S"), "The value is not the expected one");
				Hblock<Integer,Block> h;
				i.insert("S", h = new Hblock<Integer,Block>(24,b1));
				assertEquals(h,i.searchValue("S"), "The value is not the expected one");
			}
//--------------------------------------------------------------------------------------------------------------------------------------------
}