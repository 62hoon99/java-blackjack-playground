package nextstep.blackjack.model.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardsTest {

    @Test
    public void 가능한_카드의_합을_모두_반환한다() throws Exception {
        //given
        SingleValueCard kingSpadeCard = new SingleValueCard(CardShape.SPADE, CardName.KING);
        SingleValueCard fiveCloverCard = new SingleValueCard(CardShape.CLOVER, CardName.FIVE);
        MultiValueCard aceCard = new MultiValueCard(CardShape.SPADE, "A");

        Cards cards = new Cards();
        //when
        cards.addCard(kingSpadeCard, fiveCloverCard, aceCard);
        //then
        Assertions.assertThat(cards.getAvailableSum())
                .isEqualTo(CardName.KING.getNumber() + CardName.FIVE.getNumber() + 1);
    }
}
