package vendingmachine.util.generator;

import camp.nextstep.edu.missionutils.Randoms;
import vendingmachine.domain.Coin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CoinGenerator {
    public List<Coin> generate(int price) throws IllegalArgumentException {
        return generateCoin(price, getNumbers());
    }

    private List<Coin> generateCoin(int price, List<Integer> numbers) {
        List<Coin> result = new ArrayList<>();
        while (price > 0) {
            int randomCoin = Randoms.pickNumberInList(numbers);
            if (price < randomCoin) {
                continue;
            }
            result.add(Coin.getAmountCoin(randomCoin));
            price -= randomCoin;
        }
        return result;
    }
    private List<Integer> getNumbers() {
        List<Integer> result = new ArrayList<>();
        for (Coin coin : Coin.values()) {
            result.add(coin.getAmount());
        }
        return result;
    }


}
