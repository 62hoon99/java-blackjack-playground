package nextstep.blackjack.user;

import nextstep.blackjack.card.Card;

public interface User {
    void draw(Card... cards);

    int result();
}
