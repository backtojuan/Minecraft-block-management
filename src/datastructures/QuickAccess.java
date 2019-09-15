//-----------------------------------------------------------------------------------------------------------------------------------------
	package datastructures;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import java.util.Stack;
	import java.util.PriorityQueue;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create Quick-Access bars that allow
	 * to the user access in an efficient way to their blocks
	 * @param <E>
	 */
	public class QuickAccess<E> {
		
		public final static int SIZE = 7;
		
		private PriorityQueue<Stack<Stack<E>>> QueueAccess;
		private Stack<Stack<E>> stackOfStack;
		private Stack<E> stackOfElements;
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/**
		 * 
		 */
		public QuickAccess(PriorityQueue<Stack<Stack<E>>> pq, Stack<Stack<E>> sts, Stack<E> st) {
			QueueAccess = pq;
			stackOfStack = sts;
			stackOfElements = st;
			
			QueueAccess.offer(stackOfStack);
			stackOfStack.push(stackOfElements);
		}
	//---------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * 
		 * @param st
		 */
		public void addNewStack(Stack<Stack<E>> st) {
			QueueAccess.offer(st);
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------		
		/**
		 * 
		 * @param E
		 */
		public void addElement(E E) {
			stackOfElements.push(E);
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * 
		 */
		public E removeElement() {
			E e = stackOfElements.pop();
			return e;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * 
		 * @return
		 */
		public int sizeStackElements() {
			return stackOfElements.size();
		}
//-----------------------------------------------------------------------------------------------------------------------------------------	

		public PriorityQueue<Stack<Stack<E>>> getQueue(){
			return QueueAccess;
		}
		
		public Stack<E> getStackOfElements(){
			return stackOfElements;
		}
		
		public void addStack(Stack<E> stack) {
			stackOfStack.push(stack);
		}
}
	
