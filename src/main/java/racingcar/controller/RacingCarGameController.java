package racingcar.controller;

import racingcar.domain.RacingCar;
import racingcar.util.RacingCarValidation;
import racingcar.view.RacingCarGameOut;
import racingcar.view.RacingCarPlayer;

public class RacingCarGameController {
	public static void start() {
		RacingCar cars = new RacingCar(readRacingCars());
		int attemptNum = readAttemptNum();
		playGame(cars, attemptNum);
	}
	
	private static void playGame(RacingCar cars, int attemptNum) {
		RacingCarGameOut.printResult(cars);
		for(int i = 0; i < attemptNum; i++) {
			cars.play();
			RacingCarGameOut.printRoundResult(cars);
		}
	}

	private static String[] readRacingCars() {
		String carNames = RacingCarPlayer.readInputCarNames();
		boolean validCarName = checkValidCarName(carNames);
		while(!validCarName) {
			carNames = RacingCarPlayer.readInputCarNames();
			validCarName = checkValidCarName(carNames);
		}
		return carNames.split(",");
	}
	
	private static int readAttemptNum() {
		String attempNum = RacingCarPlayer.readInputAttemptNum();
		boolean validAttemptNum = checkValidAttemptNum(attempNum);
		while(!validAttemptNum) {
			attempNum = RacingCarPlayer.readInputAttemptNum();
			validAttemptNum = checkValidAttemptNum(attempNum);
		}
		return Integer.parseInt(attempNum);
	}
	
	private static boolean checkValidCarName(String carNames) {
		boolean validCarName = RacingCarValidation.validateCarName(carNames);
		if(validCarName) {
			return true;
		}
		return false;
	}
	
	private static boolean checkValidAttemptNum(String attempNum) {
		boolean validAttemptNum = RacingCarValidation.validateAttemptNum(attempNum);
		if(validAttemptNum) {
			return true;
		}
		return false;
	}

}
