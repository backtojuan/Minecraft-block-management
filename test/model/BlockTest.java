//----------------------------------------------------------------------------------------------------------------------------------------------
	package model;
//----------------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.jupiter.api.Assertions.*;
	
	import org.junit.jupiter.api.Test;
//----------------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to test the model class block
	 */
	public class BlockTest {
		
		//scenaries
		private void setUpScenary1() {	
		}
//----------------------------------------------------------------------------------------------------------------------------------------------		
		@Test
		/**
		 * This method test the constructor method of the model class block, making sure a block 
		 * is right created with its expected values.
		 */
		public void testBlock() {
			setUpScenary1();
		//------------------------------------------------------------------------------------
			Block b = new Block("W");
			assertNotNull(b,"The block is null as not expected");
			assertEquals("W", b.getType(), "The type is not the expected one");
		//------------------------------------------------------------------------------------
			Block b1 = new Block("S");
			assertNotNull(b1,"The block is null as not expected");
			assertEquals("S", b1.getType(), "The type is not the expected one");
		//------------------------------------------------------------------------------------
			Block b2 = new Block("D");
			assertNotNull(b2,"The block is null as not expected");
			assertEquals("D", b2.getType(), "The type is not the expected one");
		//------------------------------------------------------------------------------------	
			Block b3 = new Block("G");
			assertNotNull(b3,"The block is null as not expected");
			assertEquals("G", b3.getType(), "The type is not the expected one");
		//------------------------------------------------------------------------------------	
			Block b4 = new Block("O");
			assertNotNull(b4,"The block is null as not expected");
			assertEquals("O", b4.getType(), "The type is not the expected one");
		//------------------------------------------------------------------------------------	
			Block b5 = new Block("T");
			assertNotNull(b5,"The block is null as not expected");
			assertEquals("T", b5.getType(), "The type is not the expected one");
		//------------------------------------------------------------------------------------	
			Block b6 = new Block("A");
			assertNotNull(b6,"The block is null as not expected");
			assertEquals("A", b6.getType(), "The type is not the expected one");
		//------------------------------------------------------------------------------------	
			Block b7 = new Block("C");
			assertNotNull(b7,"The block is null as not expected");
			assertEquals("C", b7.getType(), "The type is not the expected one");
		}
//----------------------------------------------------------------------------------------------------------------------------------------------	
}