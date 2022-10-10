package racingcar.view;

import java.util.StringJoiner;

import racingcar.domain.RacingCars;

public class RacingCarGameOut {
	
	public static void printResult(RacingCars cars) {
		System.out.println("실행결과");
	}

	public static void printRoundResult(RacingCars cars) {
		String[][] locationList = cars.getCurrentLocation();
		for(String[] location : locationList) {
			printLocation(location);
		}
		System.out.print("\n");
	}

	private static void printLocation(String[] location) {
		System.out.println(location[0] + " : " + printLocation(location[1]));
	}

	private static String printLocation(String location) {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.parseInt(location); i++) {
            sb.append("-");
        }
        return sb.toString();
	}

	private static String arrayToString(String[] winnerCars) {
		StringJoiner sj = new StringJoiner(",");
        for (String name : winnerCars) {
            sj.add(name);
        }
        return sj.toString();
	}

	public static void getGameResult(RacingCars cars) {
		String[] winnerCars = cars.getWinnerCars();
		System.out.print("최종 우승자 : "+ arrayToString(winnerCars));
	}

	

}
