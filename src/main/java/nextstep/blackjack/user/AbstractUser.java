package nextstep.blackjack.user;

import nextstep.blackjack.card.Card;
import nextstep.blackjack.card.Cards;
import nextstep.blackjack.state.Hit;
import nextstep.blackjack.state.State;

import java.util.Arrays;

public abstract class AbstractUser implements User {

    final String name;
    final int battingMoney;
    final State state;

    public AbstractUser(String name, int battingMoney) {
        this.name = name;
        this.battingMoney = battingMoney;
        this.state = new Hit(new Cards());
    }

    @Override
    public void draw(Card... cards) {
        Arrays.stream(cards)
                .forEach(state::draw);
    }

}
