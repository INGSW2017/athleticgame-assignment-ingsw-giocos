package it.unical.test;

import java.time.Instant;
import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame athleticGame = new AthleticGame("AthleticGame");
	
	@Test
	public void arrivalsTest() {
		athleticGame.addArrival("participant", Instant.now());
		Assert.assertEquals(1, athleticGame.getArrivals().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void participantsTest() {
//		athleticGame.addArrival("ciccio", Instant.now());
		athleticGame.getParecipiantTime("ciccio");
	}
	
	
}
