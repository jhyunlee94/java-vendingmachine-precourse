package vendingmachine.controller.port;

import vendingmachine.domain.Machine;

public interface VendingMachineService {
    void addMachineCoins(Machine machine, int amount);
}
