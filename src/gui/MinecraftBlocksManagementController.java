//-----------------------------------------------------------------------------------------------------------------------------------------	
	package gui;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	import javafx.fxml.FXML;
	import org.controlsfx.control.Notifications;
	import customexception.InvalidInformationException;
	import javafx.event.ActionEvent;
	import javafx.scene.control.Button;
	import javafx.scene.control.Pagination;
	import javafx.scene.control.ScrollPane;
	import javafx.scene.control.TextField;
	import javafx.scene.layout.GridPane;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.control.Label;
	import java.util.Stack;
	import model.*;
	import datastructures.*;
//-----------------------------------------------------------------------------------------------------------------------------------------	
	/**
	 * 
	 * @author Lina Acosta Holguin
	 * @author Lina Salinas Delgado
	 * @author Maria Ordoñez Ordoñez
	 * @author Juan Valencia Jaramillo
	 * This class manage the necessary attributes and methods to show off to the user the GUI that uses the functions coded.
	 */
	public class MinecraftBlocksManagementController{
	
	    @FXML
	    private Pagination pagination;

	    @FXML
	    private TextField grassBlockAmount;

	    @FXML
	    private TextField diamondBlockAmount;

	    @FXML
	    private TextField stoneBlockAmount;

	    @FXML
	    private TextField woodenBlockAmount;

	    @FXML
	    private TextField sandBlockAmount;

	    @FXML
	    private TextField goldBlockAmount;

	    @FXML
	    private TextField glowStoneBlockAmount;

	    @FXML
	    private TextField coralBlockAmount;
	    
	    @FXML
	    private GridPane inventorybox;
	    
	    @FXML
	    private GridPane quickaccessbar;
	    
	    public final static Image GRASS = new Image("gui/imgs/grassblock.png"); 
	    public final static Image DIAMOND = new Image("gui/imgs/diamondblock.png");
	    public final static Image STONE = new Image("gui/imgs/stoneblock.png");
	    public final static Image WOODEN = new Image("gui/imgs/woodenblock.png");
	    public final static Image SAND = new Image("gui/imgs/sandblock.png");
	    public final static Image GOLD = new Image("gui/imgs/goldblock.png");
	    public final static Image GLOWSTONE = new Image("gui/imgs/glowstone.png");
	    public final static Image CORAL = new Image("gui/imgs/coralblock.gif");
	    
	    private Game game;
//----------------------------------------------------METHODS FOR THIS CLASS----------------------------------------------------------------    
	    @FXML
	    /**
	     * This method initializes the respective needed elements before the GUI is launched, once its launched is sure
	     * all nodes, controls and elements from model are waiting to be called
	     */
	    public void initialize() {
	    	game = new Game();
	    	inventorybox.setVgap(15);
	    	inventorybox.setHgap(15);
	    	quickaccessbar.setVgap(15);
	    	quickaccessbar.setHgap(15);
	    }
	//--------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method creates a new quickaccess bar requested by the user
	     * @param event the vent triggered by the user
	     */
	    private void createNewQuickAccesBar(ActionEvent event) {
	    	//proves if the values are valid
	    	try {
	  		
	    		if(grassBlockAmount.getText().equals("") && diamondBlockAmount.getText().equals("") 
	    		&& stoneBlockAmount.getText().equals("") && woodenBlockAmount.getText().equals("") 
	    		&& sandBlockAmount.getText().equals("") && goldBlockAmount.getText().equals("")
	    		&& glowStoneBlockAmount.getText().equals("") && coralBlockAmount.getText().equals("")) {
	    			throw new InvalidInformationException("",0);
	    		}
	    		else {
	    			
	    	//GRASS BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!grassBlockAmount.getText().equals("")) {
	    				int grassblocks = Integer.parseInt(grassBlockAmount.getText());
	    				if(grassblocks>64 || grassblocks<0) {
	    					throw new InvalidInformationException("numero", grassblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<grassblocks;i++) {
	    						game.addElement(new Block(Block.GRASS));
	    					}
	    						insertBlockToQuickAcces(GRASS, grassblocks);	
	    				}
	    			}
	    	
	    	//STONE BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!stoneBlockAmount.getText().equals("")) {
	    				int stoneblocks = Integer.parseInt(stoneBlockAmount.getText());
	    				if(stoneblocks>64 || stoneblocks<0) {
	    					throw new InvalidInformationException("numero", stoneblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<stoneblocks;i++) {
	    						game.addElement(new Block(Block.STONE));
	    					}
	    						insertBlockToQuickAcces(STONE, stoneblocks);	
	    				}
	    			}
	    			
	    	//DIAMOND BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!diamondBlockAmount.getText().equals("")) {
	    				int diamondblocks = Integer.parseInt(diamondBlockAmount.getText());
	    				if(diamondblocks>64 || diamondblocks<0) {
	    					throw new InvalidInformationException("numero", diamondblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<diamondblocks;i++) {
	    						game.addElement(new Block(Block.DIAMOND));
	    					}
	    						insertBlockToQuickAcces(DIAMOND, diamondblocks);	
	    				}
	    			}
	    			
	    	//WOODEN BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!woodenBlockAmount.getText().equals("")) {
	    				int woodenblocks = Integer.parseInt(woodenBlockAmount.getText());
	    				if(woodenblocks>64 || woodenblocks<0) {
	    					throw new InvalidInformationException("numero", woodenblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<woodenblocks;i++) {
	    						game.addElement(new Block(Block.WOODEN));
	    					}
	    						insertBlockToQuickAcces(WOODEN, woodenblocks);	
	    				}
	    			}
	    			
	    	//SAND BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!sandBlockAmount.getText().equals("")) {
	    				int sandblocks = Integer.parseInt(sandBlockAmount.getText());
	    				if(sandblocks>64 || sandblocks<0) {
	    					throw new InvalidInformationException("numero", sandblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<sandblocks;i++) {
	    						game.addElement(new Block(Block.SAND));
	    					}
	    						insertBlockToQuickAcces(SAND, sandblocks);	
	    				}
	    			}
	    			
	    	//GOLD BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!goldBlockAmount.getText().equals("")) {
	    				int goldblocks = Integer.parseInt(goldBlockAmount.getText());
	    				if(goldblocks>64 || goldblocks<0) {
	    					throw new InvalidInformationException("numero", goldblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<goldblocks;i++) {
	    						game.addElement(new Block(Block.GOLD));
	    					}
	    						insertBlockToQuickAcces(GOLD, goldblocks);	
	    				}
	    			}
	    			
	    	//GLOWSTONE BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!glowStoneBlockAmount.getText().equals("")) {
	    				int glowstoneblocks = Integer.parseInt(glowStoneBlockAmount.getText());
	    				if(glowstoneblocks>64 || glowstoneblocks<0) {
	    					throw new InvalidInformationException("numero", glowstoneblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<glowstoneblocks;i++) {
	    						game.addElement(new Block(Block.GLOWSTONE));
	    					}
	    						insertBlockToQuickAcces(GLOWSTONE, glowstoneblocks);	
	    				}
	    			}
	    	
	    	//CORAL BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!coralBlockAmount.getText().equals("")) {
	    				int coralblocks = Integer.parseInt(coralBlockAmount.getText());
	    				if(coralblocks>64 || coralblocks<0) {
	    					throw new InvalidInformationException("numero", coralblocks);
	    				}
	    				else {
	    					Stack<Stack<Block>> gs = new Stack<Stack<Block>>();
	    					game.addAccess(gs);
	    					for(int i=0;i<coralblocks;i++) {
	    						game.addElement(new Block(Block.CORAL));
	    					}
	    						insertBlockToQuickAcces(CORAL, coralblocks);	
	    				}
	    			}
	    		}
	    	}
	    	
	    	//catch exceptions when the user does not follow the system rules
	    	catch(InvalidInformationException iie) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text(iie.getMessage())
	    		.showWarning()
	    		;
	    	}
	    	catch(NumberFormatException nfe) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text("You cannot create a quick access bar if you havent enter enough information")
	    		.showWarning()
	    		;
	    	}
	    }
	//-------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method adds blocks to the inventory of the user with a maximum of 64 blocks per empty space
	     * @param event the event triggered by the user
	     */
	    private void addBlocksToInventory(ActionEvent event) {
	    	//proves if the values are valid
	    	try {
	    		if(grassBlockAmount.getText().equals("") && diamondBlockAmount.getText().equals("") 
	    		&& stoneBlockAmount.getText().equals("") && woodenBlockAmount.getText().equals("") 
	    		&& sandBlockAmount.getText().equals("") && goldBlockAmount.getText().equals("")
	    		&& glowStoneBlockAmount.getText().equals("") && coralBlockAmount.getText().equals("")) {
	    			throw new InvalidInformationException("",0);
	    		}
	    		else {
	    			
	    	//GRASS BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!grassBlockAmount.getText().equals("")) {
	    				int grassblocks = Integer.parseInt(grassBlockAmount.getText());
	    				if(grassblocks>64 || grassblocks<0) {
	    					throw new InvalidInformationException("numero", grassblocks);
	    				}
	    				else {
	    					
	    					String key = Block.GRASS;
	    						    					
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(grassblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}

	    					insertBlockToInventory(GRASS, index,j,grassblocks);
	    				}
	    			}
	    	
	    	//STONE BLOCKS-----------------------------------------------------------------------------------------------
	    			if(!stoneBlockAmount.getText().equals("")) {
	    				int stoneblocks = Integer.parseInt(stoneBlockAmount.getText());
	    				if(stoneblocks>64 || stoneblocks<0) {
	    					throw new InvalidInformationException("numero", stoneblocks);
	    				}
	    				else {
	    					
	    					String key = Block.STONE;
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(stoneblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}	
	    				
	    					insertBlockToInventory(STONE, index,j,stoneblocks);
	    				}
	    			}
	    			
	    	//DIAMOND BLOCKS-----------------------------------------------------------------------------------------------
	    			if(!diamondBlockAmount.getText().equals("")) {
	    				int diamondblocks = Integer.parseInt(diamondBlockAmount.getText());
	    				if(diamondblocks>64 || diamondblocks<0) {
	    					throw new InvalidInformationException("numero", diamondblocks);
	    				}
	    				else {
	    					String key = Block.DIAMOND;
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(diamondblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}		
	    					
	    					insertBlockToInventory(DIAMOND, index,j,diamondblocks);
	    				}
	    			}
	    			
	    	//WOODEN BLOCKS------------------------------------------------------------------------------------------------
	    			if(!woodenBlockAmount.getText().equals("")) {
	    				int woodenblocks = Integer.parseInt(woodenBlockAmount.getText());
	    				if(woodenblocks>64 || woodenblocks<0) {
	    					throw new InvalidInformationException("numero", woodenblocks);
	    				}
	    				else {
	    					String key = Block.WOODEN;
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(woodenblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}		
	    					
	    					insertBlockToInventory(WOODEN, index,j,woodenblocks);
	    				}
	    			}
	    	
	    	//SAND BLOCKS---------------------------------------------------------------------------------------------------
	    			if(!sandBlockAmount.getText().equals("")) {
	    				int sandblocks = Integer.parseInt(sandBlockAmount.getText());
	    				if(sandblocks>64 || sandblocks<0) {
	    					throw new InvalidInformationException("numero", sandblocks);
	    				}
	    				else {
	    					String key = Block.SAND;
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(sandblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}		

	    					insertBlockToInventory(SAND, index,j,sandblocks);
	    				}
	    			}
	    	
	    	//GOLD BLOCKS---------------------------------------------------------------------------------------------------
	    			if(!goldBlockAmount.getText().equals("")) {
	    				int goldblocks = Integer.parseInt(goldBlockAmount.getText());
	    				if(goldblocks>64 || goldblocks<0) {
	    					throw new InvalidInformationException("numero", goldblocks);
	    				}
	    				else {
	    					String key = Block.GOLD;
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(goldblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}		

	    					insertBlockToInventory(GOLD, index,j,goldblocks);
	    				}
	    			}
	    			
	    	//GLOWSTONE BLOCKS---------------------------------------------------------------------------------------------------
	    			if(!glowStoneBlockAmount.getText().equals("")) {
	    				int glowstoneblocks = Integer.parseInt(glowStoneBlockAmount.getText());
	    				if(glowstoneblocks>64 || glowstoneblocks<0) {
	    					throw new InvalidInformationException("numero", glowstoneblocks);
	    				}
	    				else {
	    					String key = Block.GLOWSTONE;
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(glowstoneblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}		

	    					insertBlockToInventory(GLOWSTONE, index,j,glowstoneblocks);
	    				}
	    			}
	    			
	    	//CORAL BLOCKS--------------------------------------------------------------------------------------------------
	    			if(!coralBlockAmount.getText().equals("")) {
	    				int coralblocks = Integer.parseInt(coralBlockAmount.getText());
	    				if(coralblocks>64 || coralblocks<0) {
	    					throw new InvalidInformationException("numero", coralblocks);
	    				}
	    				else {
	    					String key = Block.CORAL;
	    					Hblock<Integer,Block> value = new Hblock<Integer, Block>(coralblocks,new Block(key));
	    					game.addToInventory(key, value);
	    					
	    					int index = game.getInventory().hash1(key);
	    					int j = 0;
	    					if(index>8 && index<=17) {
	    						j = 1;
	    					}
	    					else if(index>17 && index<=26) {
	    						j = 2;
	    					}	

	    					insertBlockToInventory(CORAL, index,j,coralblocks);
	    				}
	    			}
	    		}
	    	}
	    	catch(InvalidInformationException iie) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text(iie.getMessage())
	    		.showWarning()
	    		;
	    	}
	    	catch(NumberFormatException nfe) {
	    		Notifications.create()
	    		.title("WARNING")
	    		.darkStyle()
	    		.hideCloseButton()
	    		.text("You cannot create a quick access bar if you havent enter enough information")
	    		.showWarning()
	    		;
	    	}
	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method passes a determined amount of coral type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passCoralBlockToQuickAccess(ActionEvent event) {
	    	
	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method passes a determined amount of diamond type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passDiamondBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------    
	    @FXML
	    /**
	     * This method passes a determined amount of stone type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passGlowStoneBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------    
	    @FXML
	    /**
	     * This method passes a determined amount of gold type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passGoldBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method passes a determined amount of grass type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passGrassBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method passes a determined amount of sand type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passSandBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method passes a determined amount of stone type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passStoneBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    /**
	     * This method passes a determined amount of wooden type blocks to the inventary
	     * @param event the event triggered by the user
	     */
	    private void passWoodenBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    /**
	     * This methods allows to refresh the GUI and show to the user that the requested block elements were 
	     * insert in their inventory
	     * @param image the visual representation of the block
	     * @param index the position where the block is stored
	     * @param j the extra index posición for the grid 
	     * @param blocks the number of blocks that were stored by this request
	     */
		private void insertBlockToInventory(Image image, int index, int j,int blocks) {
	  
	    	ImageView block = new ImageView(image);
	    	block.setFitHeight(50);
	    	block.setFitWidth(75);
	    	inventorybox.add(block, index, j);
	    	Label b = new Label(""+blocks+"");
	    	
	    	inventorybox.add(b,index,j+1);
	    	
	    }
	 //-----------------------------------------------------------------------------------------------------------------------------------------
	//------------------------------------------------------------------------------------------------------------------------------------------
	    /**
	     * This method allows to refresh the GUI and show to the user that the requested quickacces bar
	     * were added to their game.
	     * @param image the visual representation of this block.
	     * @param blocks the amount of blocks that were store by this request
	     */
	    private void insertBlockToQuickAcces(Image image,int blocks) {
	    	
	    	for(int i=0;i<2;i++) {
	    		for(int j=0;j<7;j++) {
	    			if(i==0) {
	    		    	ImageView block = new ImageView(image);
	    		    	block.setFitHeight(50);
	    		    	block.setFitWidth(75);
	    				quickaccessbar.add(block,j,i);
	    			}
	    			else {
	    				while(blocks>0) {
	    					quickaccessbar.add(new Label(""+blocks+""),j,i);
	    					blocks -= 64;
	    				}
	    			}
	    		}
	    	}	
	    }
//----------------------------------------------------------------------------------------------------------------------------------------------	
}