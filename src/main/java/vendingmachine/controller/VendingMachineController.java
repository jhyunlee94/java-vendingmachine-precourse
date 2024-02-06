package vendingmachine.controller;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.controller.port.VendingMachineService;
import vendingmachine.domain.Machine;
import vendingmachine.util.generator.CoinGenerator;
import vendingmachine.util.parser.Parser;
import vendingmachine.view.OutputView;

import static vendingmachine.view.InputView.printMachineCoinsAmount;
import static vendingmachine.view.OutputView.printMachineAmountMessage;
import static vendingmachine.view.OutputView.printMachinePreMessage;

public class VendingMachineController {
    private final VendingMachineService vendingMachineService;
    CoinGenerator coinGenerator = new CoinGenerator();

    public VendingMachineController(VendingMachineService vendingMachineService) {
        this.vendingMachineService = vendingMachineService;
    }

    public void run() {
        Machine machine = new Machine();
        init(machine);
    }

    void init(Machine machine) {
        getMachineCoinsByManager(machine);
    }

    public void getMachineCoinsByManager(Machine machine) {
        printMachineCoinsAmount();
//        int coins = inputMachineCoins();
        inputMachineCoins(machine);
        printMachinePreMessage();
//        vendingMachineService.addMachineCoins(machine, coins);
        printMachineAmountMessage(vendingMachineService.getMachineCoins(machine));
    }

    private void inputMachineCoins(Machine machine) {
        Integer machineCoin = getMachineCoin();
        try {
            vendingMachineService.addMachineCoins(machine, machineCoin);
        } catch (IllegalArgumentException e) {
            OutputView.printExceptionMessage(e.getMessage());
            inputMachineCoins(machine);
        }
    }

    private Integer getMachineCoin() {
        try {
            return Parser.convertStringToInt(Console.readLine());
        } catch (IllegalArgumentException e) {
            OutputView.printExceptionMessage(e.getMessage());
            return getMachineCoin();
        }
    }
}