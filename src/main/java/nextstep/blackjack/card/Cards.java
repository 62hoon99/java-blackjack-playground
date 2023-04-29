package nextstep.blackjack.card;

import java.util.ArrayList;
import java.util.List;

public class Cards {

    private static final int MAX_COUNT = 21;
    private final List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        cards.add(card);
    }

    public int getScore() {
        return cards.stream()
                .map(Card::getScore)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public boolean isBust() {
        return getScore() > MAX_COUNT;
    }
}
