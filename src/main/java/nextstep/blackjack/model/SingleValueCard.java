package nextstep.blackjack.model;

public class SingleValueCard extends AbstractCard {

    private static final int DEFAULT_VALUE_FOR_STRING_NAME = 10;
    private final int value;

    public SingleValueCard(CardShape shape, String name) {
        super(shape, name);
        this.value = createValue(name);
    }

    private int createValue(String name) {
        try {
            return Integer.parseInt(name);
        } catch (NumberFormatException e) {
            return DEFAULT_VALUE_FOR_STRING_NAME;
        }
    }

    public int getValue() {
        return this.value;
    }
}
