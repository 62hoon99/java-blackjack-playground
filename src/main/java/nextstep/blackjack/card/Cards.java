package nextstep.blackjack.card;

import java.util.ArrayList;
import java.util.List;

public class Cards {

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
}
