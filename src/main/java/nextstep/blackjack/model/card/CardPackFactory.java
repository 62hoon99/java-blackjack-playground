package nextstep.blackjack.model.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CardPackFactory {

    private static final String ACE = "A";

    public static CardPack create() {
        return new CardPack(createCards());
    }

    private static List<Card> createCards() {
        return Arrays.stream(CardShape.values())
                .map(CardPackFactory::createCardsByShape)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private static List<Card> createCardsByShape(CardShape shape) {
        List<Card> cards = new ArrayList<>();
        addSingleValueCards(shape, cards);
        addAceCard(shape, cards);
        return cards;
    }

    private static void addAceCard(CardShape shape, List<Card> cards) {
        cards.add(new MultiValueCard(shape, ACE));
    }

    private static void addSingleValueCards(CardShape shape, List<Card> cards) {
        Arrays.stream(CardName.values())
                .forEach(CardName ->
                        cards.add(new SingleValueCard(shape, CardName))
                );
    }
}
