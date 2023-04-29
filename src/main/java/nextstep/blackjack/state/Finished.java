package nextstep.blackjack.state;

import nextstep.blackjack.card.Card;
import nextstep.blackjack.card.Cards;

public abstract class Finished extends Started {

    public Finished(Cards cards) {
        super(cards);
    }

    @Override
    public State draw(Card card) {
        return this;
    }

    @Override
    public State stay() {
        return this;
    }

    @Override
    public boolean isFinished() {
        return true;
    }

    @Override
    public double profit(double battingMoney) {
        return battingMoney * earningRate();
    }

    public abstract double earningRate();
}
