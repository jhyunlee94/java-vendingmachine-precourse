package vendingmachine.util.parser;

import vendingmachine.domain.Item;
import vendingmachine.util.validator.CoinValidator;
import vendingmachine.util.validator.ItemValidator;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public static int convertStringToInt(String input) throws IllegalArgumentException {
        CoinValidator.checkCoin(input);
        return Integer.parseInt(input);
    }

    public static List<Item> convertItemInput(String input) {
        ItemValidator.isEmpty(input);
        // [콜라,1500,20];[사이다,1000,10]
        String[] split = input.split(";");
        List<Item> itemList = new ArrayList<>();
        for (String str : split) {
            ItemValidator.checkInBracket(str);

            str = str.replace("[","").replace("]","");
            String[] itemArray = str.split(",");

            ItemValidator.checkItems(itemArray);

            Integer price = convertStringToInt(itemArray[1]);
            Integer quantity = convertStringToInt(itemArray[2]);
            itemList.add(new Item(itemArray[0], price, quantity));
        }
//        for (Item i : itemList) {
//            System.out.println(i.toString());
//        }

        return itemList;
    }
}
