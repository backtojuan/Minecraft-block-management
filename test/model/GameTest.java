package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameTest {
	
	private Game g;
	
	private void setUpScenary1() {
		
	}

	@Test
	public void test() {
		setUpScenary1();
		g = new Game();
		assertNotNull(g,"The game is null as not expected");
	}

}
