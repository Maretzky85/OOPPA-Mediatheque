package tests;

import com.company.model.Game;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GameTest{

	Game testGame;

	@Before
	public void setUp() throws Exception {
		this.testGame = new Game(1, "Doom", "ID", "1999", "IdSoftware download page", 50);
	}

	@After
	public void tearDown() throws Exception {
		this.testGame = null;
	}

	@Test
	public void toStringTest() {
		assertTrue(testGame.toString().equals("Title: Doom, Studio: ID, Release Date: 1999, Playable Hours: 50"));
	}

}