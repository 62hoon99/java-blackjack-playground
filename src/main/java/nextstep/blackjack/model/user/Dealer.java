package nextstep.blackjack.model.user;

import nextstep.blackjack.model.card.Card;
import nextstep.blackjack.model.card.CardPack;
import nextstep.blackjack.model.card.CardPackFactory;

public class Dealer extends AbstractUser {
    private static final String HIT_MSG = "딜러는 16이하라 한장의 카드를 더 받았습니다.";
    private static final String NAME = "딜러";
    private final CardPack cardPack;

    public Dealer() {
        super(NAME, 0);
        this.cardPack = CardPackFactory.create();
    }

    public Card getCard() {
        return cardPack.getRandomCard();
    }

    public void hit() {
        if (getNumber() < 16) {
            System.out.println(HIT_MSG);
            receiveCard(getCard());
        }
    }
}
