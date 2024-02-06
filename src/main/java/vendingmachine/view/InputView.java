package vendingmachine.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static void printMachineCoinsAmount() {
        System.out.println("자판기가 보유하고 있는 금액을 입력해 주세요.");
    }

    public static void printMachineItems() {
        System.out.println();
        System.out.println("상품명과 가격, 수량을 입력해 주세요.");
    }
}
