package racingcar.domain;

import racingcar.constants.RacingCarNum;

public class RacingCar {
	private String carName;
	private int location;

	public RacingCar(String carName) {
		this.carName = carName;
		this.location = RacingCarNum.LOCATION_INIT;
	}

	public String getCarName() {
		return carName;
	}

	public int getLocation() {
		return location;
	}

	public void playRacing(int randomNum) {
		if (randomNum >= RacingCarNum.FOWARD_NUM) {
			locationForward();
		}
	}

	private void locationForward() {
		location++;
	}

}
