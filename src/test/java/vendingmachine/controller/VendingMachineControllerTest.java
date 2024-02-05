package vendingmachine.controller;

import org.junit.jupiter.api.Test;
import vendingmachine.util.validator.Validator;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class VendingMachineControllerTest {
    @Test
    public void 입력값이_없으면_에러를_체크한다() {
        // given
        String input = "";
        // when
        // then
        assertThatThrownBy(() -> {
            Validator.isCoinsEmpty(input);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 값을 입력해 주세요.");
    }

    @Test
    public void 입력값이_숫자인지_에러를_체크한다() {
        // given
        String input = "a";

        // when
        // then
        assertThatThrownBy(() -> {
            Validator.isCoinsNumber(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 숫자를 알맞게 입력해 주세요.");
    }

    @Test
    public void 입력값이_양수인지_에러를_체크한다() {
        // given
        String input = "-1";

        // when
        // then
        assertThatThrownBy(() -> {
            Validator.isCoinsPositive(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 0이상의 수를 입력해 주세요.");
    }

    @Test
    public void 입력값이_10원으로_나누어_떨어지는지_체크한다() {
        // given
        String input = "1";

        // when
        // then
        assertThatThrownBy(() -> {
            Validator.isCoinsDivisible(input);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 돈은 10원으로 나누어 떨어져야 합니다.");
    }
}
