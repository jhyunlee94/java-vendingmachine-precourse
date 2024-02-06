package vendingmachine.util.validator;

import java.util.regex.Pattern;

public class Validator {
    private static final int DIVISIBLE_VALUE = 10;
    // 값이 존재하는지
    public static void isEmpty(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 값을 입력해 주세요.");
        }
    }

    // 값이 숫자인지
    public static void isNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 알맞게 입력해 주세요.");
        }
    }
    // 값이 양수인지
    public static void isPositive(String input) {
        if (Integer.parseInt(input) < 0) {
            throw new IllegalArgumentException("[ERROR] 0이상의 수를 입력해 주세요.");
        }
    }
    // 10원으로 나누어 떨어지는지
    public static void isDivisible(String input) {
        if (Integer.parseInt(input) % DIVISIBLE_VALUE != 0) {
            throw new IllegalArgumentException("[ERROR] 돈은 10원으로 나누어 떨어져야 합니다.");
        }
    }

    // 값이 한글인지 체크
    public static void isKoreanInput(String input) {
        String regex = "[가-힣]+";
        if(!Pattern.matches(regex, input)) {
            throw new IllegalArgumentException("[ERROR] 한글만 입력해주세요.");
        }
    }
}
