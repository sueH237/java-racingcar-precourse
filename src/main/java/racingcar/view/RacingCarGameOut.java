package racingcar.view;

import racingcar.domain.RacingCar;

public class RacingCarGameOut {
	
	public static void printResult(RacingCar cars) {
		System.out.println("실행결과");
	}

	public static void printRoundResult(RacingCar cars) {
		String[][] locationList = cars.getCurrentLocation();
		for(String[] location : locationList) {
			printLocation(location);
		}
		System.out.print("\n");
	}

	private static void printLocation(String[] location) {
		System.out.println(location[0] + ": " + printLocation(location[1]));
	}

	private static String printLocation(String location) {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(location); i++) {
            sb.append("-");
        }
        return sb.toString();
	}

	

}
