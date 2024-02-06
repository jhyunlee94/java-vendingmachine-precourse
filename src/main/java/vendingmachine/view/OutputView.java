package vendingmachine.view;

import java.util.Map;

public class OutputView {

    public static void printExceptionMessage(String message) {
        System.out.println(message);
    }

    public static void printMachinePreMessage() {
        System.out.println();
        System.out.println("자판기가 보유한 동전");
    }

    public static void printMachineAmountMessage(Map<Integer, Integer> sortedCoin) {
        for (Integer i : sortedCoin.keySet()) {
            System.out.println(i +"원 - "+ sortedCoin.get(i)+"개");
        }
    }
}
