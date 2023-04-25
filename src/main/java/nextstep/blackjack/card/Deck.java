package nextstep.blackjack.card;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Deck {

    private static final List<Card> cards;

    static {
        cards = Arrays.stream(Suit.values())
                .flatMap(suit ->
                        Arrays.stream(Denomination.values())
                                .map(denomination -> new Card(suit, denomination))
                )
                .collect(Collectors.toList());
    }

    public static Card getCard(Supplier<Integer> supplier) {
        Card card = cards.get(supplier.get());
        cards.remove(card);
        return card;
    }

    public static int size() {
        return cards.size();
    }
}
