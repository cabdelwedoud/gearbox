package electrics.industries;

/**
 * This class aims to calculate and handle the speed shift for an automatic gearbox. 
 * 
 * @author cheikhna
 *
 */
public class Gearbox {

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
		if (speed == 0 || (engineSpeed > 2000 && speed < 6)) {
			speed++;
		} else if (engineSpeed < 500 && speed > 1) {
			speed--;
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