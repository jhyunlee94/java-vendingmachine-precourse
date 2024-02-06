package vendingmachine.util.validator;

public class ItemValidator extends Validator {
    public static void checkInBracket(String input) {
//        if (input.indexOf('[') != 0) {
//            throw new IllegalArgumentException("[ERROR] 상품정보를 제대로 입력해 주세요.");
//        }
//        if (input.lastIndexOf(']') != input.length() -1) {
//            throw new IllegalArgumentException("[ERROR] 상품정보를 제대로 입력해 주세요.");
//        }
        if(!input.startsWith("[") || !input.endsWith("]")) {
            throw new IllegalArgumentException("[ERROR] 상품정보를 제대로 입력해 주세요.");
        }
    }

    public static void checkItems(String[] input) {
        if (input.length != 3) {
            throw new IllegalArgumentException("[ERROR] 상품정보를 제대로 입력해 주세요.");
        }
        isKoreanInput(input[0]);
        isNumber(input[1]);
        isNumber(input[2]);
    }

}
