package electrics.industries;

/**
 * This class aims to calculate and handle the speed shift for an automatic gearbox. 
 * 
 * @author cheikhna
 *
 */
public class Gearbox {

	public static final int MAX_ENGINE_SPEED = 2000;
	public static final int MIN_ENGINE_SPEED = 500;
	public static final int MAX_SPEED = 6;
	public static final int MIN_SPEED = 1;
	
	private int speed;
    private int currentEngineSpeed;

    /**
     * This method allows calculating the speed based on the engine speed.
     * <h1>Rules:</h1>
     * <ul>
     * 	<li>When calling the first time this method the speed passes to the first </li>
     * 	<li>The speed cannot exceed the sixth</li>
     *  <li>If the engine speed is greater than 2000 the speed is passed to the next speed</li>
     *  <li>If the engine speed is less than 500 the speed is passed to the previous speed</li>
     * 	<li>The current speed is kept in the property {@link #currentEngineSpeed}</li>
     * 	<li>The calculated speed is stored in the property {@link #speed}</li>
     * </ul>
     * 
     * @param engineSpeed
     */
	public void calculateSpeed(int engineSpeed) {
		if (speed == 0 || (engineSpeed > MAX_ENGINE_SPEED && speed < MAX_SPEED)) {
			speed++;
		} else {
			if (engineSpeed < MIN_ENGINE_SPEED && speed > MIN_SPEED) {
				speed--;
			}
		}
		currentEngineSpeed = engineSpeed;
	}


    /**
	 * This method gets the last speed passed to the gearbox
	 * @return
	 * 		speed
	 */
    public int getSpeed() {
		return speed;
	}

	/**
	 * this method gets the latest received engine speed
	 * @return
	 * 		currentEngineSpeed
	 */
	public int getCurrentEngineSpeed() {
		return currentEngineSpeed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setCurrentEngineSpeed(int currentEngineSpeed) {
		this.currentEngineSpeed = currentEngineSpeed;
	}

}