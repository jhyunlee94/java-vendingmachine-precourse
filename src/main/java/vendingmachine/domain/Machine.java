package vendingmachine.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Machine {
    private final List<Coin> machineCoins = new ArrayList<>();
    public void addCoins(List<Coin> coins) {
        this.machineCoins.addAll(coins);
    }

    public Map<Integer, Integer> getCoins() {
        return Coin.getSortedCoinMap();
    }
}
