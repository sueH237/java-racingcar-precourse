package racingcar.util;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.Test;

import racingcar.constants.RacingCarMessage;

public class RacingCarValidationTest {
	@Test
    void attempt_num에_대한_예외_처리_null(){
        assertThatIllegalArgumentException().isThrownBy(
                ()-> RacingCarValidation.validateAttemptNum(null)).withMessageContaining(
                        String.format(RacingCarMessage.MESSAGE_VALIDATION_INPUT_NUM)
                );
    }
}
