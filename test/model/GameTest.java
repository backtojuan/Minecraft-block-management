//----------------------------------------------------------------------------------------------------------------------------------------------
	package model;
//----------------------------------------------------------------------------------------------------------------------------------------------	
	import static org.junit.jupiter.api.Assertions.*;
	import static org.junit.Assert.assertTrue;	
	import org.junit.jupiter.api.Test;
//----------------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to test the model class game
	 */
	public class GameTest {
		
		private Game g;
		
		//Scenearies
		private void setUpScenary1() {
			
		}
//----------------------------------------------------------------------------------------------------------------------------------------------	
		@Test
		/**
		 * This method test the constructor of the model class game, making sure a game
		 * can be created and so its elements.
		 * 
		 * rest of the methods for this class were not tested 
		 * since they re-used methods that are declared either on inventory or quickacces class
		 * so they are already tested in their respective test cases.
		 */
		public void testGame() {
			setUpScenary1();
			
			g = new Game();
			assertNotNull(g,"The game is null as not expected");
			assertNotNull(g.getInventory(), "The inventory is null as not expected");
			assertNotNull(g.getQuickAcces(),"The quickaccess is null as not expected");
			
			assertTrue("The inventary was not created",g.getInventory().getInventory().length==27);
				for(int i=0;i<27;i++) {
					assertTrue("The element was already stored",g.getInventory().getInventory()[i]==null);
				}
				
			assertTrue("The quickaccess was not created",g.getQuickAcces().getQueue()!=null);
			assertTrue("The quickaccess can not store elements",g.getQuickAcces().getStackOfElements()!=null);
			assertTrue("Elements have been previously stored",g.getQuickAcces().getStackOfElements().size()==0);
		}
//----------------------------------------------------------------------------------------------------------------------------------------------	
}
