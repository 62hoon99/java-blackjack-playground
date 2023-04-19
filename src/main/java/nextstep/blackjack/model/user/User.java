package nextstep.blackjack.model.user;

import nextstep.blackjack.model.card.Card;

public interface User {
    void receiveCard(Card... card);

    String cardInfo();
}
