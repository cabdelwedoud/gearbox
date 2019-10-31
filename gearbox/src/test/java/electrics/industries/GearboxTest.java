package electrics.industries;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class GearboxTest {

	@Test
	public void calculateSpeedCalledTheFirstTimeShouldReturnTheFirstSpeedAndKeepTheEngineSpeed() {
		Gearbox gearbox = new Gearbox();
		int expectedSpeed = 1;
		int engineSpeed = 1000;
		gearbox.calculateSpeed(engineSpeed);
		
		assertEquals(expectedSpeed, gearbox.getSpeed());
		assertEquals(engineSpeed, gearbox.getCurrentEngineSpeed());
	}
	
	@Test
	public void calculateSpeedShouldPassTheNextIfTheEngineSpeedExceedTheMax() {
		Gearbox gearbox = new Gearbox();
		int expectedSpeed = 2;
		int initialSpeed = 1;
		int engineSpeed = 2500;
		
		gearbox.setSpeed(initialSpeed);
		
		gearbox.calculateSpeed(engineSpeed);
		
		assertEquals(expectedSpeed, gearbox.getSpeed());
		assertEquals(engineSpeed, gearbox.getCurrentEngineSpeed());
	}
	
	@Test
	public void calculateSpeedShouldPassThePrevIfTheEngineSpeedUnderTheMin() {
		Gearbox gearbox = new Gearbox();
		int expectedSpeed = 2;
		int initialSpeed = 3;
		int engineSpeed = 400;
		
		gearbox.setSpeed(initialSpeed);
		
		gearbox.calculateSpeed(engineSpeed);
		
		assertEquals(expectedSpeed, gearbox.getSpeed());
		assertEquals(engineSpeed, gearbox.getCurrentEngineSpeed());
	}
	
	@Test
	public void calculateSpeedShouldNotExceedTheSixth() {
		Gearbox gearbox = new Gearbox();
		int initialSpeed = 6;
		int engineSpeed = 2500;
		
		gearbox.setSpeed(initialSpeed);
		
		gearbox.calculateSpeed(engineSpeed);
		
		assertEquals(initialSpeed, gearbox.getSpeed());
		assertEquals(engineSpeed, gearbox.getCurrentEngineSpeed());
	}
	
	@Test
	public void calculateSpeedShouldNotShiftWithMiddleEngineSpeed() {
		Gearbox gearbox = new Gearbox();
		int initialSpeed = 4;
		int engineSpeed = 1000;
		
		gearbox.setSpeed(initialSpeed);
		
		gearbox.calculateSpeed(engineSpeed);
		
		assertEquals(initialSpeed, gearbox.getSpeed());
		assertEquals(engineSpeed, gearbox.getCurrentEngineSpeed());
	}


}
