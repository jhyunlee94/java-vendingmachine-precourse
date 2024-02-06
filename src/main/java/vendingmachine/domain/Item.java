package vendingmachine.domain;

public class Item {
    private final String name;
    private final Integer price;
    private  Integer quantity; // quantity 는 변경됨 수량 체크

    public Item(String name, Integer price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
