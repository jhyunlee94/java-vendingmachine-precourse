package vendingmachine.service;

import vendingmachine.domain.Machine;
import vendingmachine.util.CoinGenerator;

import java.util.Map;

public class VendingMachineService {
    CoinGenerator coinGenerator = new CoinGenerator();
    public void addCoins(Machine machine, Integer totalCoin) {
        machine.addCoins(coinGenerator.generate(totalCoin));
    }

    public Map<Integer, Integer> getMachineCoin(Machine machine) {
        return machine.getCoins();
    }
}
