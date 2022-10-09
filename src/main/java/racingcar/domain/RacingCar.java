package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

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
	
}
