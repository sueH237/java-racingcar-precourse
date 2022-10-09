package racingcar.controller;

import racingcar.domain.RacingCar;
import racingcar.view.RacingCarPlayer;

public class RacingCarGameController {
	public static void start() {
		RacingCar cars = new RacingCar(readRacingCars());
		int attemptNum = readAttemptNum();
	}
	
	private static String[] readRacingCars() {
		String carNames = RacingCarPlayer.readInputCarNames();
		return carNames.split(",");
	}
	
	private static int readAttemptNum() {
		String attempNum = RacingCarPlayer.readInputAttemptNum();
		return Integer.parseInt(attempNum);
	}

}
