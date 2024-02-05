package vendingmachine.domain;

public enum Coin {
    COIN_500(500),
    COIN_100(100),
    COIN_50(50),
    COIN_10(10);

    private final int amount;

    Coin(final int amount) {
        this.amount = amount;
    }

    // 추가 기능 구현
    public int getAmount() {
        return amount;
    }

    public static Coin getAmountCoin(int amount) {
        for (Coin coin : Coin.values()) {
            // enum의 요소들을 순서대로 enum타입의 배열로 리턴
            if(coin.getAmount() == amount) {
                return coin;
            }
        }
        return null;
    }

}
