package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;

public abstract class Started implements State{

    final Cards cards;

    public Started(Cards cards) {
        this.cards = cards;
    }

    @Override
    public Cards cards() {
        return cards;
    }
}
