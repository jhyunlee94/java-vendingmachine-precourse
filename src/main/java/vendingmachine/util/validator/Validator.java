package vendingmachine.util.validator;

public class Validator {
    private static final int DIVISIBLE_VALUE = 10;
    // 값이 존재하는지
    public static void isCoinsEmpty(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 값을 입력해 주세요.");
        }
    }

    // 값이 숫자인지
    public static void isCoinsNumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 알맞게 입력해 주세요.");
        }
    }
    // 값이 양수인지
    public static void isCoinsPositive(String input) {
        if (Integer.parseInt(input) < 0) {
            throw new IllegalArgumentException("[ERROR] 0이상의 수를 입력해 주세요.");
        }
    }
    // 10원으로 나누어 떨어지는지
    public static void isCoinsDivisible(String input) {
        if (Integer.parseInt(input) % DIVISIBLE_VALUE != 0) {
            throw new IllegalArgumentException("[ERROR] 돈은 10원으로 나누어 떨어져야 합니다.");
        }
    }
}
