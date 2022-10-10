package racingcar.util;

import racingcar.view.RacingCarError;

public class RacingCarValidation {

	public static boolean validateCarName(String carNames) {
		String[] carNameList = carNames.split(",");
		try {
			validationCarList(carNameList);
		} catch (IllegalArgumentException e) {
			RacingCarError.printCarName(e.getMessage());
			return false;
		}
		return true;
	}

	private static boolean validationCarList(String[] carNameList) {
		for (String carName : carNameList) {
			validateCarNameLength(carName);
		}
		return true;
	}

	private static boolean validateCarNameLength(String carName) {
		if (carName.length() <= 5 && carName.length() >= 1) {
			return true;
		}
		throw new IllegalArgumentException("[ERROR]자동차 이름은 1자 이상 5자 이하입니다.");
	}

	public static boolean validateAttemptNum(String attempNum) {
		try {
			Integer.parseInt(attempNum);
		} catch (NumberFormatException e) {
			RacingCarError.printAttemptNum(e.getMessage());
			return false;
		}
		return true;
	}

}
