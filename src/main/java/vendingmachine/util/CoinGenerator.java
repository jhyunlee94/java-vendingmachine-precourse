package vendingmachine.util;

import camp.nextstep.edu.missionutils.Randoms;
import vendingmachine.domain.Coin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinGenerator {
    public List<Coin> generate(int price) {
        List<Coin> coinList = new ArrayList<>();
        while (price > 0) {
            int randomCoin = Randoms.pickNumberInList(Coin.getCoinList());
            System.out.println(randomCoin);

            if (price < randomCoin){
                continue;
            }

            coinList.add(Coin.getCoin(randomCoin));
//            System.out.println(Coin.getCoin(randomCoin));
            price -= randomCoin;
//            System.out.println(price);
        }
        System.out.println(coinList);
        return coinList;
    }
}

