package vendingmachine.service;

import vendingmachine.controller.port.VendingMachineService;
import vendingmachine.domain.Machine;
import vendingmachine.util.generator.CoinGenerator;

import java.util.Map;

public class VendingMachineServiceImpl implements VendingMachineService {
    CoinGenerator coinGenerator = new CoinGenerator();
    @Override
    public void addMachineCoins(Machine machine, int coins) {
        machine.addMachineCoins(coinGenerator.generate(coins));
    }

    @Override
    public Map<Integer, Integer> getMachineCoins(Machine machine) {
        return machine.getMachineCoins();
    }
}
