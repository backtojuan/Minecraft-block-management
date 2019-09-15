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
	    public void initialize() {
	    	game = new Game();
	    
	    	for(int i=0;i<1;i++) {
	    		for(int j=0;j<7;j++) {
	    			ImageView block = new ImageView(GRASS);
	    			block.setFitHeight(50);
	    			block.setFitWidth(75);
	    			quickaccessbar.add(block, j, i);
	    		}
	    	}
	    }
	//--------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
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
	    			if(!grassBlockAmount.getText().equals("")) {
	    				int grassblocks = Integer.parseInt(grassBlockAmount.getText());
	    				if(grassblocks>64 || grassblocks<0) {
	    					throw new InvalidInformationException("numero", grassblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!stoneBlockAmount.getText().equals("")) {
	    				int stoneblocks = Integer.parseInt(stoneBlockAmount.getText());
	    				if(stoneblocks>64 || stoneblocks<0) {
	    					throw new InvalidInformationException("numero", stoneblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!diamondBlockAmount.getText().equals("")) {
	    				int diamondblocks = Integer.parseInt(diamondBlockAmount.getText());
	    				if(diamondblocks>64 || diamondblocks<0) {
	    					throw new InvalidInformationException("numero", diamondblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!woodenBlockAmount.getText().equals("")) {
	    				int woodenblocks = Integer.parseInt(woodenBlockAmount.getText());
	    				if(woodenblocks>64 || woodenblocks<0) {
	    					throw new InvalidInformationException("numero", woodenblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!sandBlockAmount.getText().equals("")) {
	    				int sandblocks = Integer.parseInt(sandBlockAmount.getText());
	    				if(sandblocks>64 || sandblocks<0) {
	    					throw new InvalidInformationException("numero", sandblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!goldBlockAmount.getText().equals("")) {
	    				int goldblocks = Integer.parseInt(goldBlockAmount.getText());
	    				if(goldblocks>64 || goldblocks<0) {
	    					throw new InvalidInformationException("numero", goldblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!glowStoneBlockAmount.getText().equals("")) {
	    				int glowstoneblocks = Integer.parseInt(glowStoneBlockAmount.getText());
	    				if(glowstoneblocks>64 || glowstoneblocks<0) {
	    					throw new InvalidInformationException("numero", glowstoneblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!coralBlockAmount.getText().equals("")) {
	    				int coralblocks = Integer.parseInt(coralBlockAmount.getText());
	    				if(coralblocks>64 || coralblocks<0) {
	    					throw new InvalidInformationException("numero", coralblocks);
	    				}
	    				else {
	    					
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
	    							
	    					insertBlockToInventory(GRASS, index,j);
	    					
	    				}
	    			}
	    			else if(!stoneBlockAmount.getText().equals("")) {
	    				int stoneblocks = Integer.parseInt(stoneBlockAmount.getText());
	    				if(stoneblocks>64 || stoneblocks<0) {
	    					throw new InvalidInformationException("numero", stoneblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!diamondBlockAmount.getText().equals("")) {
	    				int diamondblocks = Integer.parseInt(diamondBlockAmount.getText());
	    				if(diamondblocks>64 || diamondblocks<0) {
	    					throw new InvalidInformationException("numero", diamondblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!woodenBlockAmount.getText().equals("")) {
	    				int woodenblocks = Integer.parseInt(woodenBlockAmount.getText());
	    				if(woodenblocks>64 || woodenblocks<0) {
	    					throw new InvalidInformationException("numero", woodenblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!sandBlockAmount.getText().equals("")) {
	    				int sandblocks = Integer.parseInt(sandBlockAmount.getText());
	    				if(sandblocks>64 || sandblocks<0) {
	    					throw new InvalidInformationException("numero", sandblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!goldBlockAmount.getText().equals("")) {
	    				int goldblocks = Integer.parseInt(goldBlockAmount.getText());
	    				if(goldblocks>64 || goldblocks<0) {
	    					throw new InvalidInformationException("numero", goldblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!glowStoneBlockAmount.getText().equals("")) {
	    				int glowstoneblocks = Integer.parseInt(glowStoneBlockAmount.getText());
	    				if(glowstoneblocks>64 || glowstoneblocks<0) {
	    					throw new InvalidInformationException("numero", glowstoneblocks);
	    				}
	    				else {
	    					
	    				}
	    			}
	    			else if(!coralBlockAmount.getText().equals("")) {
	    				int coralblocks = Integer.parseInt(coralBlockAmount.getText());
	    				if(coralblocks>64 || coralblocks<0) {
	    					throw new InvalidInformationException("numero", coralblocks);
	    				}
	    				else {
	    					
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
	    private void passCoralBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    private void passDiamondBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------    
	    @FXML
	    private void passGlowStoneBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------    
	    @FXML
	    private void passGoldBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    private void passGrassBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    private void passSandBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    private void passStoneBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    @FXML
	    private void passWoodenBlockToQuickAccess(ActionEvent event) {

	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    private void insertBlockToInventory(Image image, int index, int j) {
	  
	    	ImageView block = new ImageView(image);
	    	block.setFitHeight(50);
	    	block.setFitWidth(75);
	    	inventorybox.add(block, index, j);
	    }
	//------------------------------------------------------------------------------------------------------------------------------------------
	    private void insertBlockToQuickAcces() {
	    	
	    }
//----------------------------------------------------------------------------------------------------------------------------------------------	
}