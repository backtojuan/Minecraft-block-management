	package datastructures;
	
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
	
	import model.Block;
	
	class HblockTest {
	
		private Hblock<Integer,Block> h;
	
		private void setUpScenary1() {
			
		}
		@Test
		public void testHBlock() {
			setUpScenary1();
			Block b1;
			Hblock<Integer,Block> h1 = new Hblock<Integer,Block>(24,b1= new Block("G"));
			assertNotNull(h1,"The inventory is null as not expected");
			assertTrue(h1.getKey() == 24);
			assertEquals(b1, h1.getValue(), "The Value is not the expected one");
		}
		@Test
		public void testsetNext() {
			Block b1;
			h = new Hblock<Integer, Block>(24,b1= new Block("W"));
			Block b2;
			Hblock<Integer, Block> h2 = new Hblock<Integer,Block>(24, b2 = new Block("D"));
			h.setNext(h2);
			assertEquals(h2, h.getNext(), "The Hblock is not the expected one");
		}
		@Test
		public void testsetValue() {
			Block b1;
			h = new Hblock<Integer, Block>(24,b1= new Block("W"));
			assertEquals(b1, h.getValue(), "The Value is not the expected one");
			Block b2 = new Block("D");
			h.setValue(b2);
			assertEquals(b2, h.getValue(), "The Value is not the expected one");
		}
	}