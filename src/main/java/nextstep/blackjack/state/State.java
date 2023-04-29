package nextstep.blackjack.state;

import nextstep.blackjack.card.Card;

public interface State {
    State draw(Card card);

    State stay();

    boolean isFinished();

    double profit(double battingMoney);
}
