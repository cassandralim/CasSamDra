package lifepoint.counter;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest extends Player {

	@Test
	public void testAddLP() {
		Player p1 = new Player("Sam");
		assertEquals(8000, p1.getLifepoints());
		p1.addLP(-500);
		assertEquals(7500, p1.getLifepoints());
		p1.addLP(1000);
		assertEquals(8500, p1.getLifepoints());
	}
	@Test
	public void testAddGame() {
		Player p1 = new Player("Sam");
		assertEquals(0, p1.getGamesPlayed());
		p1.addGame(1);
		assertEquals(1, p1.getGamesPlayed());
		p1.addGame(-1);
		assertEquals(0, p1.getGamesPlayed());
	}
	
	@Test
	public void testAddWin() {
		Player p1 = new Player("Sam");
		assertEquals(0, p1.getWins());
		p1.addWin(1);
		assertEquals(1, p1.getWins());
		p1.addWin(-1);
		assertEquals(0, p1.getWins());
	}

}
