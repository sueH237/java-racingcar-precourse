package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RacingCarRandom {
	
	private int randomNum;
	
	public RacingCarRandom() {
		this.randomNum = getRandomNumber();
	}
	
	public int getRandomNum() {
		return this.randomNum;
	}
	
	private int getRandomNumber() {
		return Randoms.pickNumberInRange(0, 9);
	}
	
}
