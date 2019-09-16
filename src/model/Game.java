//-----------------------------------------------------------------------------------------------------------------------------------------
	package model;
//-----------------------------------------------------------------------------------------------------------------------------------------
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Stack;
	import javax.lang.model.element.Element;
	import datastructures.QuickAccess;
	import datastructures.Hblock;
	import datastructures.Inventory;
//-----------------------------------------------------------------------------------------------------------------------------------------
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to create the main game when the user starts the game
	 */
	public class Game {
		
		private Inventory<String,Hblock<Integer,Block>>inventory;
		private QuickAccess<Block> quickAccess;
//----------------------------------------------------METHODS FOR THIS CLASS----------------------------------------------------------------

		public Game() {
			inventory = new Inventory<>();
			quickAccess = new QuickAccess<Block>(new LinkedList<>(), new Stack<Stack<Block>>(), new Stack<Block>());
		}
	//--------------------------------------------------------------------------------------------------------------------------------------	
		public Inventory<String, Hblock<Integer, Block>> getInventory(){
			return inventory;
		}
	//--------------------------------------------------------------------------------------------------------------------------------------
		public QuickAccess<Block> getQuickAcces(){
			return quickAccess;
		}
	//--------------------------------------------------------------------------------------------------------------------------------------
		public void addToInventory(String key, Hblock<Integer,Block> value) {
			inventory.insert(key, value);
		}
		
	//--------------------------------------------------------------------------------------------------------------------------------------
		public void addAccess(Stack<Stack<Block>> newaccess) {
			quickAccess.addNewStack(newaccess);
		}
	//--------------------------------------------------------------------------------------------------------------------------------------
		public void addElement(Block newblock) {
			quickAccess.addElement(newblock);
		}
	//--------------------------------------------------------------------------------------------------------------------------------------
		public Block removeElement(Element E) {
			return quickAccess.removeElement();
		}
	}
//-------------------------------------------------------------------------------------------------------------------------------------------