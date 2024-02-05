package vendingmachine.util.validator;

public class CoinValidator extends Validator{
    public static void checkCoin(String input) throws IllegalArgumentException {
        isCoinsEmpty(input);
        isCoinsNumber(input);
        isCoinsPositive(input);
        isCoinsDivisible(input);
    }
}
