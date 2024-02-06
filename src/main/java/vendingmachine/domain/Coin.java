package vendingmachine.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

    public static Map<Integer, Integer> sortedCoins(List<Coin> coinList) {
        Map<Integer, Integer> coinMap = new TreeMap<>();
        for (Coin coin : Coin.values()) {
            coinMap.put(coin.getAmount(), 0);
        }

        for (Coin coin : coinList) {
//            int coinValue = parseCoinValue(String.valueOf(coin));
//            System.out.println(coinValue);
            coinMap.put(coin.getAmount(), coinMap.getOrDefault(coin.getAmount(), 0) + 1);
        }
//        System.out.println("coinMap : " +coinMap );
        return coinMap;
    }

    private static int parseCoinValue(String coin) {
        // 이거 사용하면 만약 0개인거는 체크를 못하게됨,,,
        return Integer.parseInt(coin.substring("COIN_".length()));
    }


    public int getAmount() {
        return amount;
    }

    public static Coin getAmountCoin(int amount) {
        for (Coin coin : Coin.values()) {
            // Coin.values() : enum의 요소들을 순서대로 enum타입의 배열로 리턴
            if(coin.getAmount() == amount) {
                return coin;
            }
        }
        return null;
    }

}
