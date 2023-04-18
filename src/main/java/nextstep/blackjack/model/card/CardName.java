package nextstep.blackjack.model.card;

public enum CardName {
    ONE("1", 1),
    TWO("2", 2),
    THREE("3", 3),
    FOUR("4", 4),
    FIVE("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    KING("K", 10),
    QUEEN("Q", 10),
    JACK("J", 10);

    private final String initial;
    private final int number;

    CardName(String initial, Integer number) {
        this.initial = initial;
        this.number = number;
    }

    public String getInitial() {
        return initial;
    }

    public Integer getNumber() {
        return number;
    }
}
