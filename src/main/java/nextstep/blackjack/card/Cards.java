package nextstep.blackjack.card;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {

    private static final int ACE_ANOTHER_VALUE = 11;
    private static final int MAX_COUNT = 21;
    private final List<Card> cards = new ArrayList<>();

    public void add(Card card) {
        cards.add(card);
    }

    public int getScore() {
        return getAceCardsScore(getNoneAceCardsScore(0));
    }

    private int getAceCardsScore(int score) {
        List<Card> aceCards = getAceCards();
        for (Card aceCard : aceCards) {
            if (score + ACE_ANOTHER_VALUE > MAX_COUNT) {
                score += aceCard.getScore();
            }
            if (score + ACE_ANOTHER_VALUE <= MAX_COUNT) {
                score += ACE_ANOTHER_VALUE;
            }
        }
        return score;
    }

    private int getNoneAceCardsScore(int score) {
        return getNoneAceCards().stream().map(Card::getScore).mapToInt(Integer::intValue).sum() + score;
    }

    private List<Card> getNoneAceCards() {
        return cards.stream().filter(card -> !card.isAce()).collect(Collectors.toList());
    }

    private List<Card> getAceCards() {
        return cards.stream().filter(Card::isAce).collect(Collectors.toList());
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
