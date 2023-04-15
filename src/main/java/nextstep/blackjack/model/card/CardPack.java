package nextstep.blackjack.model.card;

import java.util.List;
import java.util.NoSuchElementException;

public class CardPack {

    private static final String EMPTY_CARDS_MESSAGE = "더이상 사용할 수 있는 카드가 없습니다.";

    private final List<Card> cards;

    public CardPack(List<Card> cards) {
        this.cards = cards;
    }

    public boolean contains(Card card) {
        return cards.stream()
                .anyMatch(c -> c.equals(card));
    }

    public Card getRandomCard() {
        Card selectedCard = cards.stream()
                .findAny()
                .orElseThrow(() -> new NoSuchElementException(EMPTY_CARDS_MESSAGE));
        cards.remove(selectedCard);
        return selectedCard;
    }
}
