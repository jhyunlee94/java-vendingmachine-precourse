package vendingmachine;

import jdk.nashorn.internal.parser.JSONParser;
import vendingmachine.controller.VendingMachineController;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // TODO: 프로그램 구현
        VendingMachineController vendingMachineController = new VendingMachineController();
        vendingMachineController.run();
    }
}
