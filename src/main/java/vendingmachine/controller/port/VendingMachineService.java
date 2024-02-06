package vendingmachine.controller.port;

import vendingmachine.domain.Machine;

import java.util.Map;

public interface VendingMachineService {
    void addMachineCoins(Machine machine, int coins);

    Map<Integer, Integer> getMachineCoins(Machine machine);
}
