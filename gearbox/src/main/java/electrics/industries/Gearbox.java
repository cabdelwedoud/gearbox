package electrics.industries;

public class Gearbox {

    private int speed = 0;
    private int currentEngineSpeed = 0;

    public void calculateSpeed(int engineSpeed) {
        if (speed < 0) {
            // do nothing!
            currentEngineSpeed = engineSpeed;
        }
        else {
            if (speed > 0) {
                if (engineSpeed > 2000) {
                    speed++;
                } else if (engineSpeed < 500) {
                    speed--;
                }
            } if (speed > 6) {
                speed--;
            } else if (speed < 1) {
                speed++;
            }
            currentEngineSpeed = engineSpeed;
        }
    }

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCurrentEngineSpeed() {
		return currentEngineSpeed;
	}

	public void setCurrentEngineSpeed(int currentEngineSpeed) {
		this.currentEngineSpeed = currentEngineSpeed;
	}

}