package vendingmachine.controller;

import static vendingmachine.view.InputView.requestMachineCoinsAmount;

public class VendingMachineController {

    public void run() {
        init();
    }

    void init() {
        requestMachineCoinsAmount();
    }
}
