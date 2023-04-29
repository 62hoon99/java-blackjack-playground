package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;

public abstract class Running extends Started {

    public Running(Cards cards) {
        super(cards);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
