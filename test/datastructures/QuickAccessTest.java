//----------------------------------------------------------------------------------------------------------------------------------------------
	package datastructures;
//----------------------------------------------------------------------------------------------------------------------------------------------
	import static org.junit.Assert.assertTrue;
	import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
	
	import org.junit.jupiter.api.Test;
	
	import model.Block;
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to test the datastructure class QuickAccess
	 */
	public class QuickAccessTest {
		
		private QuickAccess<Block> quickAccess;
		
		//Scenaries
		private void setupScenary1() {
		}
		
		private void setupScenary2() {
			Queue<Stack<Stack<Block>>> queueAccess = new LinkedList<>();
			Stack<Stack<Block>> stackOfStack = new Stack<>();
			Stack<Block> stackOfElements = new Stack<>();
			quickAccess = new QuickAccess<>(queueAccess,stackOfStack,stackOfElements);
		}
	//----------------------------------------------------------------------------------------------------------------------------------------------
		@Test
		/**
		 * This method test the constructor of the datastructure class QuickAccess, making sure a quick access bar can 
		 * be created whenever the user requires it.
		 */
		public void TestQuickAccess() {
			setupScenary1();
			Queue<Stack<Stack<Block>>> queueAccess = new LinkedList<>();
			Stack<Stack<Block>> stackOfStack = new Stack<>();
			Stack<Block> stackOfElements = new Stack<>();
			quickAccess = new QuickAccess<>(queueAccess,stackOfStack,stackOfElements);
			assertNotNull(quickAccess,"");
			assertTrue("The queue of the Quick Access is incorrect",(queueAccess.equals(quickAccess.getQueue())));
			assertTrue("The stack of the elements of the Quick Access is incorrect",(stackOfElements.equals(quickAccess.getStackOfElements())));
		}
	//----------------------------------------------------------------------------------------------------------------------------------------------	
		@Test
		/**
		 * This method test the adding method of a quickaccess, making sure that a new quickaccess
		 * can be added to the main queue structure.
		 */
		public void TestAddNextStack() {
			setupScenary2();
			quickAccess.getQueue().poll();
			Stack<Stack<Block>> stack1 = new Stack<>();
			quickAccess.addNewStack(stack1);
			assertTrue("",(stack1.equals(quickAccess.getQueue().peek())));
		}
	//----------------------------------------------------------------------------------------------------------------------------------------------	
		@Test 
		/**
		 * This method test the adding method of an element, making sure that a new element
		 * can be added to the quickacces previously created.
		 */
		public void TestAddElement() {
			setupScenary2();
			Block block = new Block("C");
			quickAccess.addElement(block);
			assertTrue("The element is not being added correctly",(block.equals(quickAccess.getStackOfElements().peek())));
		}
	//----------------------------------------------------------------------------------------------------------------------------------------------	
		@Test
		/**
		 * This method test the removing method of an element, making sure that whenever the user
		 * uses a block this is deleted from the quickaccess
		 */
		public void TestRemoveElements() {
			setupScenary2();
			Block block = new Block("C");
			quickAccess.addElement(block);
			Block removeBlock = quickAccess.removeElement();
			assertTrue("the element is not being deleted correctly",(block.equals(removeBlock)));
		}
	//----------------------------------------------------------------------------------------------------------------------------------------------	
		@Test
		/**
		 * This method test the sizing method of elements, making sure that the amount of elements
		 * in a quickaccess bar is returned with the expected and right value.
		 */
		public void TestsizeStackElements() {
			setupScenary2();
			int max = 64;
			for (int i = 0; i<max; i++) {
				Block block = new Block("C");
				quickAccess.addElement(block);
			}
			int size = quickAccess.sizeStackElements();
			assertTrue( "the size is incorrect",max == size);
		}
//----------------------------------------------------------------------------------------------------------------------------------------------		
}
