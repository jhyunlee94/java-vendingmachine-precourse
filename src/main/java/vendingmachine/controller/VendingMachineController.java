package vendingmachine.controller;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import vendingmachine.domain.Coin;
import vendingmachine.domain.Machine;
import vendingmachine.service.VendingMachineService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static vendingmachine.view.InputView.requestMachineCoinsAmount;
import static vendingmachine.view.OutputView.printExceptionMessage;
import static vendingmachine.view.OutputView.printHoldCoinByMachine;

public class VendingMachineController {
    VendingMachineService vendingMachineService = new VendingMachineService();

    public void run() {
        init();
    }

    void init() {
        Machine machine = new Machine();
        inputCoinsByManager(machine);

//        System.out.println(Randoms.pickNumberInList(integers));
    }

    private void inputCoinsByManager(Machine machine) {
        requestMachineCoinsAmount();
//        Integer[] COIN_NUMBERS = {500, 100 , 50, 10};
//
//        System.out.println(Randoms.pickNumberInList(Arrays.asList(COIN_NUMBEARS)));
//        System.out.println(Coin.getCoinList());

        vendingMachineService.addCoins(machine, inputCoinsByUser());
        vendingMachineService.getMachineCoin(machine);
        printHoldCoinByMachine();
    }

    private Integer inputCoinsByUser() {
        try {
            Integer coin = Integer.valueOf(Console.readLine());
            System.out.println(coin);
            return coin;
        } catch (IllegalArgumentException error) {
            printExceptionMessage(error.getMessage());
            return 0;
        }

    }
}
