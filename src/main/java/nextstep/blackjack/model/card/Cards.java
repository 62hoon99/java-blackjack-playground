package nextstep.blackjack.model.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cards {

    private final List<Card> cards;

    public Cards() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card... cards) {
        this.cards.addAll(Arrays.asList(cards));
    }

    public int getAvailableSum() {
        List<Card> singleValueCards = cards.stream()
                .filter(card -> card instanceof SingleValueCard)
                .collect(Collectors.toList());

        List<Card> multiValueCards = cards.stream()
                .filter(card -> card instanceof MultiValueCard)
                .collect(Collectors.toList());
        // 알고리즘의 영역이네 이건 대충 넘기자

        int sum = singleValueCards.stream()
                .map(Card::getValue)
                .mapToInt(Integer::intValue)
                .sum();

        return sum + multiValueCards.size();
    }

    public String getInfo() {
        List<String> cardsInfo = cards.stream()
                .map(Card::getInfo)
                .collect(Collectors.toList());
        return String.join(", ", cardsInfo);
    }
}
