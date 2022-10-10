package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import racingcar.domain.RacingCarRandom;

public class RacingCar {
	private List<RacingCar> racingCars;
	private String carName;
	private int location;
	
	public RacingCar(String[] carNames) {
		racingCars = new ArrayList<>();
		for (String carName : carNames) {
			racingCars.add(new RacingCar(carName));
		}
	}

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

	public void play() {
		for (RacingCar car : racingCars) {
			RacingCarRandom carRandom = new RacingCarRandom();
			car.playRacing(carRandom.getRandomNum());
		}
	}

	private void playRacing(int randomNum) {
		if (randomNum >= 4) {
			locationForward();
		}
	}

	private void locationForward() {
		location++;
	}

	public String[][] getCurrentLocation() {
		String[][] location = new String[racingCars.size()][2];
        for (int i = 0; i < racingCars.size(); i++) {
        	location[i] = createLocation(racingCars.get(i));
        }
        return location;
	}

	private String[] createLocation(RacingCar racingCar) {
		String[] location = {racingCar.getCarName(), String.valueOf(racingCar.getLocation())};
        return location;
	}
	
}
