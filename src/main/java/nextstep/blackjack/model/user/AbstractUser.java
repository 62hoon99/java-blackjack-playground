package nextstep.blackjack.model.user;

import nextstep.blackjack.model.card.Card;
import nextstep.blackjack.model.card.Cards;

public abstract class AbstractUser implements User {

    private final String name;
    private final long money;
    private final Cards cards;

    public AbstractUser(String name, long money) {
        this.name = name;
        this.money = money;
        this.cards = new Cards();
    }

    @Override
    public void receiveCard(Card... card) {
        cards.addCard(card);
    }

    @Override
    public String cardInfo() {
        return name + "카드: " + cards.getInfo();
    }
}
