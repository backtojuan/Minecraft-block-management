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
	 * @param <E> the generic raw type for this class which indicates that the data structure is going to store elements
	 */
	public class QuickAccess<E> {
		
		public final static int SIZE = 7;
		
		private PriorityQueue<Stack<Stack<E>>> QueueAccess;
		private Stack<Stack<E>> stackOfStack;
		private Stack<E> stackOfElements;
		
//----------------------------------------------------METHODS FOR THIS CLASS---------------------------------------------------------------
		/**
		 * <b>QuickAccess Constructor</b>
		 * @param pq the main queue structure that are going to store the all quick acces bar desired by the user. 
		 * @param sts the first quick acces bar that the user wants to create
		 * @param st the amount of block elements that are going to be store.
		 */
		public QuickAccess(PriorityQueue<Stack<Stack<E>>> pq, Stack<Stack<E>> sts, Stack<E> st) {
			QueueAccess = pq;
			stackOfStack = sts;
			stackOfElements = st;
			
			QueueAccess.offer(stackOfStack);
			stackOfStack.push(stackOfElements);
		}
	//------------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the main structure that stores the quickaccesbar created by the user
		 * <b>Pre:</b> the QuickAccess exists
		 * @return the structure that stores the quick access bars
		 */
		public PriorityQueue<Stack<Stack<E>>> getQueue(){
			return QueueAccess;
		}
	//------------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method returns the structure where are store all the element blocks by an user
		 * <b>Pre:</b> the QuickAccess exists
		 * @return the structure with the block elements
		 */
		public Stack<E> getStackOfElements(){
			return stackOfElements;
		}
	//------------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method adds a new amount of elements into a quick access bar.
		 * <b>Pre:</b> The quickaccess exists
		 * <b>Pos:</b> The elements were added into the quick access bar.
		 * @param stack the stack with the elements that required to be stored.
		 */
		public void addStack(Stack<E> stack) {
			stackOfStack.push(stack);
		}
	//------------------------------------------------------------------------------------------------------------------------------------------
		/**
		 * This method addds a new quickaccess bar into the main queue structure.
		 * <b>Pre:</b> The quickaccess exists
		 * <b>Pos:</b> The quickaccess bar was added into the main queue structure.
		 * @param st the quickaccess bar that needs to be added.
		 */
		public void addNewStack(Stack<Stack<E>> st) {
			QueueAccess.offer(st);
		}
		
	//-----------------------------------------------------------------------------------------------------------------------------------------		
		/**
		 * This method adds a single element with the rest of their own type
		 * <b>Pre:</b>> The quickaccess exists.
		 * <b>Pos:</b> The single element required was added.
		 * @param E the element that is going to be stored.
		 */
		public void addElement(E E) {
			stackOfElements.push(E);
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * This method removes a single element once the user decided to use it
		 * <b>Pre:</b> The quickaccess exists.
		 * <b>Pos:</b> the element requested for using was deleted and does not remain with the rest anymore.
		 * @return the element that got popped out of the stack in order to be use by the user
		 */
		public E removeElement() {
			E e = stackOfElements.pop();
			return e;
		}
	//-----------------------------------------------------------------------------------------------------------------------------------------	
		/**
		 * This method calculates the amount of blocks that are store in a single position of a quickaccess bar
		 * <b>Pre:</b> the quickaccess exists.
		 * <b>Pos:</b> the amount of elements is the right one.
		 * @return the amount of elements that are inside the quickaccessbar
		 */
		public int sizeStackElements() {
			return stackOfElements.size();
		}
//----------------------------------------------------------------------------------------------------------------------------------------------	
}

	
