package nextstep.blackjack.card;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public String toString() {
        List<String> cardInfos = cards.stream()
                .map(Card::toString)
                .collect(Collectors.toList());

        return String.join(", ", cardInfos);
    }
}
