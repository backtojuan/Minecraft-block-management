//--------------------------------------------------------------------------------------------------------------------------------------------
	package datastructures;
//--------------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
	
	import model.Block;
//-------------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to test the datastructure class Hblock
	 */
	public class HblockTest {
	
		private Hblock<Integer,Block> h;
		private Block b2;
		
		
		//Scenaries
		private void setUpScenary1() {
		}
		
		private void setUpScenary2() {
			b2 = new Block("D");
		}
		
//--------------------------------------------------------------------------------------------------------------------------------------------
		@Test
		/**
		 * This method test the constructor of the datastructure class Hblock, 
		 * making sure a Hblock is right created with its expected values
		 */
		public void testHBlock() {
			setUpScenary1();
			Block b1;
			Hblock<Integer,Block> h1 = new Hblock<Integer,Block>(24,b1= new Block("G"));
			assertNotNull(h1,"The inventory is null as not expected");
			assertTrue(h1.getKey() == 24);
			assertEquals(b1, h1.getValue(), "The Value is not the expected one");
		}
		
	//------------------------------------------------------------------------------------------------------------------------------------------
		@Test
		/**
		 * This method test a set method of the datastructure class Hblock, making sure that a linked list can be created by
		 * linking the current node with another one.
		 */
		public void testsetNext() {
			setUpScenary2();
			Block b1;
			h = new Hblock<Integer, Block>(24,b1= new Block("W"));
			Hblock<Integer, Block> h2 = new Hblock<Integer,Block>(24, b2);
			h.setNext(h2);
			assertEquals(h2, h.getNext(), "The Hblock is not the expected one");
		}
	//------------------------------------------------------------------------------------------------------------------------------------------
		@Test
		/**
		 * This method test a set method of the datastructure class Hblock, making sure that the type of block can be set
		 * when it is required.
		 */
		public void testsetValue() {
			setUpScenary2();
			Block b1;
			h = new Hblock<Integer, Block>(24,b1= new Block("W"));
			assertEquals(b1, h.getValue(), "The Value is not the expected one");
			h.setValue(b2);
			assertEquals(b2, h.getValue(), "The Value is not the expected one");
		}
//----------------------------------------------------------------------------------------------------------------------------------------------
}