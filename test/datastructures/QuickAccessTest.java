package datastructures;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.PriorityQueue;
import java.util.Stack;

import org.junit.jupiter.api.Test;

import model.Block;

class QuickAccessTest {
	
	private QuickAccess<Block> quickAccess;

	private void setupScenary1() {
		
	}
	
	private void setupScenary2() {
		PriorityQueue<Stack<Stack<Block>>> queueAccess = new PriorityQueue<>();
		Stack<Stack<Block>> stackOfStack = new Stack<>();
		Stack<Block> stackOfElements = new Stack<>();
		quickAccess = new QuickAccess<>(queueAccess,stackOfStack,stackOfElements);
	}
	
	@Test
	void TestQuickAccess() {
		setupScenary1();
		PriorityQueue<Stack<Stack<Block>>> queueAccess = new PriorityQueue<>();
		Stack<Stack<Block>> stackOfStack = new Stack<>();
		Stack<Block> stackOfElements = new Stack<>();
		quickAccess = new QuickAccess<>(queueAccess,stackOfStack,stackOfElements);
		assertNotNull(quickAccess,"");
		assertTrue("The queue of the Quick Access is incorrect",(queueAccess.equals(quickAccess.getQueue())));
		assertTrue("The stack of the elements of the Quick Access is incorrect",(stackOfElements.equals(quickAccess.getStackOfElements())));
	}
	
	@Test
	void TestAddNextStack() {
		setupScenary2();
		quickAccess.getQueue().poll();
		Stack<Stack<Block>> stack1 = new Stack<>();
		quickAccess.addNewStack(stack1);
		assertTrue("",(stack1.equals(quickAccess.getQueue().peek())));
	}
	
	@Test 
	void TestAddElement() {
		setupScenary2();
		Block block = new Block("C");
		quickAccess.addElement(block);
		assertTrue("The element is not being added correctly",(block.equals(quickAccess.getStackOfElements().peek())));
	}
	
	@Test
	void TestRemoveElements() {
		setupScenary2();
		Block block = new Block("C");
		quickAccess.addElement(block);
		Block removeBlock = quickAccess.removeElement();
		assertTrue("the element is not being deleted correctly",(block.equals(removeBlock)));
	}
	
	@Test
	void TestsizeStackElements() {
		setupScenary2();
		int max = 64;
		for (int i = 0; i<max; i++) {
			Block block = new Block("C");
			quickAccess.addElement(block);
		}
		int size = quickAccess.sizeStackElements();
		assertTrue( "the size is incorrect",max == size);
	}
	
	
	
}
