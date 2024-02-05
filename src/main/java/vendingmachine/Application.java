package vendingmachine;

import vendingmachine.controller.VendingMachineController;
import vendingmachine.controller.port.VendingMachineService;
import vendingmachine.service.VendingMachineServiceImpl;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        VendingMachineService vendingMachineService = new VendingMachineServiceImpl();
        VendingMachineController vendingMachineController = new VendingMachineController(vendingMachineService);
        vendingMachineController.run();
    }
}
