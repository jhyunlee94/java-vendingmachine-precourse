package vendingmachine.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public enum Coin {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    // 추가 기능 구현
    public int getAmount() {
        return amount;
    }

    public static List<Integer> getCoinList() {
        List<Integer> coinList = new ArrayList<>();
        for (Coin value : vendingmachine.domain.Coin.values()) {
//            System.out.println(value);
//            value는 COIN_500 COIN_100 COIN_50 COIN_10
            coinList.add(value.amount);
//            value.amount 는 [500, 100, 50, 10]
        }
        return coinList;
    }

    public static Coin getCoin(int amount) {
        for (Coin coin : vendingmachine.domain.Coin.values()) {
            if (coin.getAmount() == amount) {
                return coin;
            }
        }
        return null;
    }

    public static Map<Integer, Integer> getSortedCoinMap() {
        return null; // 여기서 부터 다시해야함
    }
}
