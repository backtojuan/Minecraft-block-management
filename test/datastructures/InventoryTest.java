	package datastructures;
	
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
	
	import model.Block;
	
	class InventoryTest {
	
		private Inventory<String, Hblock<Integer,Block>> i;
	
		private void setUpScenary1() {
			
		}
			@Test
			public void testInventory() {
				setUpScenary1();
				i = new Inventory<>();
				assertNotNull(i,"The inventory is null as not expected");
			}
			
			@Test
			public void testInsert() {
				setUpScenary1();
				i = new Inventory<>();
				Block b1 = new Block("S");
				String key = "S";
				i.insert(key, new Hblock<Integer,Block>(24,b1));
				assertNotNull(i.getInventary(), "The inventary is null as not expected");
			}
			
			@Test
			public void testGetValue() {
				setUpScenary1();
				i = new Inventory<>();
				assertEquals(null,i.getValue(null), "The value is not the expected one");
				Block b1 = new Block("S");
				assertEquals(null,i.getValue("S"), "The value is not the expected one");
				Hblock<Integer,Block> h;
				i.insert("S", h = new Hblock<Integer,Block>(24,b1));
				assertEquals(h,i.getValue("S"), "The value is not the expected one");
			}
			
			@Test
			public void testSearch() {
				setUpScenary1();
				i = new Inventory<>();
				assertEquals(null,i.searchValue(null), "The value is not the expected one");
				assertEquals(null,i.searchValue("S"), "The value is not the expected one");
				Block b1 = new Block("S");
				Hblock<Integer,Block> h;
				i.insert("S", h = new Hblock<Integer,Block>(24,b1));
				assertEquals(h,i.searchValue("S"), "The value is not the expected one");
			}
	
}