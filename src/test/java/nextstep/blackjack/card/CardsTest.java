package nextstep.blackjack.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardsTest {

    @Test
    public void score_합산을_반환한다() throws Exception {
        //given
        Cards cards = new Cards();
        //when
        cards.add(new Card(Suit.CLUBS, Denomination.EIGHT));
        cards.add(new Card(Suit.DIAMONDS, Denomination.KING));
        //then
        Assertions.assertThat(cards.getScore()).isEqualTo(18);
    }
}
