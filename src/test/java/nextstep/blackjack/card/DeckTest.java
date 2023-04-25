package nextstep.blackjack.card;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class DeckTest {

    @Test
    public void 무작위_카드_하나를_반환하는_기능() throws Exception {
        //then
        assertThat(Deck.getCard(() -> new Random().nextInt(Deck.size()))).isInstanceOf(Card.class);
    }

    @Test
    public void 반환한_카드는_덱에_남지_않는다() throws Exception {
        //given
        Card fourthCard1 = Deck.getCard(() -> 4);
        Card fourthCard2 = Deck.getCard(() -> 4);
        //then
        assertThat(fourthCard1.equals(fourthCard2)).isFalse();
    }
}
