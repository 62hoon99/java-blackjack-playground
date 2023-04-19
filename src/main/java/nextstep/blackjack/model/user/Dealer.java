package nextstep.blackjack.model.user;

import nextstep.blackjack.model.card.Card;
import nextstep.blackjack.model.card.CardPack;
import nextstep.blackjack.model.card.CardPackFactory;

public class Dealer extends AbstractUser {

    private static final String NAME = "딜러";
    private final CardPack cardPack;

    public Dealer() {
        super(NAME, 0);
        this.cardPack = CardPackFactory.create();
    }

    public Card getCard() {
        return cardPack.getRandomCard();
    }
}
