package vendingmachine.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Machine {

    private final List<Coin> coinList = new ArrayList<>();

    public void addMachineCoins(List<Coin> coins) {
//        System.out.println(coins);
        this.coinList.addAll(coins);
//        System.out.println(coinList);
    }

    public Map<Integer, Integer> getMachineCoins() {
        return Coin.sortedCoins(coinList);
    }
}
