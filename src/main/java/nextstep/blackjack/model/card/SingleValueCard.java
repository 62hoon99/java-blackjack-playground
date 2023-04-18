package nextstep.blackjack.model.card;

public class SingleValueCard extends AbstractCard {

    private final int value;

    public SingleValueCard(CardShape shape, CardName cardName) {
        super(shape, cardName.getInitial());
        this.value = cardName.getNumber();
    }

    @Override
    public int getValue() {
        return this.value;
    }
}
