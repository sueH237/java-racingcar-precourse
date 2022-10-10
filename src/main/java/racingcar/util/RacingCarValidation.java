package racingcar.util;

import racingcar.constants.RacingCarMessage;
import racingcar.view.RacingCarError;

public class RacingCarValidation {

	public static boolean validateCarName(String carNames) {
		String[] carNameList = carNames.split(RacingCarMessage.CAR_NAME_COMMA);
		try {
			validationCarList(carNameList);
		} catch (IllegalArgumentException e) {
			RacingCarError.printCarName(RacingCarMessage.ERROR_PREFIX + e.getMessage());
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
		throw new IllegalArgumentException(RacingCarMessage.MESSAGE_VALIDATION_INPUT_LENGTH);
	}

	public static boolean validateAttemptNum(String attempNum) {
		try {
			Integer.parseInt(attempNum);
		} catch (NumberFormatException e) {
			RacingCarError.printAttemptNum(RacingCarMessage.ERROR_PREFIX + e.getMessage());
			return false;
		}
		return true;
	}

}
