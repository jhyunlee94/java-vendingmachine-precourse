package vendingmachine.service;

import vendingmachine.controller.port.VendingMachineService;
import vendingmachine.domain.Machine;

public class VendingMachineServiceImpl implements VendingMachineService {
    @Override
    public void addMachineCoins(Machine machine, int amount) {
        machine.addMachineCoins();
    }
}
