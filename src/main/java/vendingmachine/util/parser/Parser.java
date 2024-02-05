package vendingmachine.util.parser;

import vendingmachine.util.validator.CoinValidator;

public class Parser {
    public static int convertStringToInt(String input) throws IllegalArgumentException {
        CoinValidator.checkCoin(input);
        return Integer.parseInt(input);
    }
}
