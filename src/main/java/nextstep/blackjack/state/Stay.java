package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;

public class Stay extends Finished {

    public Stay(Cards cards) {
        super(cards);
    }

    @Override
    public double earningRate() {
        return 1f;
    }

}
