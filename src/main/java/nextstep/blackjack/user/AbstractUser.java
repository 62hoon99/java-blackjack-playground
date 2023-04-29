package nextstep.blackjack.user;

import nextstep.blackjack.card.Card;
import nextstep.blackjack.card.Cards;
import nextstep.blackjack.state.Hit;
import nextstep.blackjack.state.State;

import java.util.Arrays;

public abstract class AbstractUser implements User {

    private final String name;
    private final int battingMoney;
    private final State state;

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

    @Override
    public String toString() {
        return name + "카드: " + state.cards().toString();
    }
}
