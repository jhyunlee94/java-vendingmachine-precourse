package vendingmachine.controller;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.controller.port.VendingMachineService;
import vendingmachine.util.generator.CoinGenerator;
import vendingmachine.util.parser.Parser;
import vendingmachine.view.OutputView;

import static vendingmachine.view.InputView.printMachineCoinsAmount;
import static vendingmachine.view.OutputView.printMachineAmountMessage;

public class VendingMachineController {

    private final VendingMachineService vendingMachineService;
    CoinGenerator coinGenerator = new CoinGenerator();
    public VendingMachineController(VendingMachineService vendingMachineService) {
        this.vendingMachineService = vendingMachineService;
    }

    public void run() {
        init();
    }

    void init() {
        getMachineCoinsByManager();
    }

    public void getMachineCoinsByManager() {
        printMachineCoinsAmount();
        int coins = inputMachineCoins();
        printMachineAmountMessage();

    }

    private Integer inputMachineCoins() {
        try {
            return  Parser.convertStringToInt(Console.readLine());
        } catch (IllegalArgumentException e) {
            OutputView.printExceptionMessage(e.getMessage());
            return inputMachineCoins();
        }
    }
}
