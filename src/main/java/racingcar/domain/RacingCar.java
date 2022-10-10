package racingcar.domain;

public class RacingCar {
	private String carName;
	private int location;
	
	public RacingCar(String carName) {
		this.carName = carName;
		this.location = 0;
	}
	
	public String getCarName() {
		return carName;
	}
	
	public int getLocation() {
		return location;
	}

	public void playRacing(int randomNum) {
		if (randomNum >= 4) {
			locationForward();
		}
	}

	private void locationForward() {
		location++;
	}

}
