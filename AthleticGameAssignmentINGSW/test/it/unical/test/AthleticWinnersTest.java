package it.unical.test;

import java.time.Instant;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticWinnersTest {

	private static AthleticGame game;
	
	@BeforeClass
	public static void init() {
		game = new AthleticGame("AthleticGame");
	}
	
	@After
	public void resetTest() {
		game.reset();
	}
	
	@Before
	public void startTest() {
		game.start();
	}
	
	@Test
	public void getWinnerFirstTest() {
		
		game.addArrival("p1", Instant.now());
		game.addArrival("p2", Instant.now().plusMillis(250));
		game.addArrival("p3", Instant.now().plusMillis(500));
		Assert.assertEquals("p1", game.getWinner());
	}
	
	@Test
	public void getWinnerSecondTest() {
		Assert.assertEquals(null, game.getWinner());
	}
}
