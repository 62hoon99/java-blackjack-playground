package nextstep.blackjack.model.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardPackTest {

    @Test
    public void 사용하지않은_카드를_랜덤하게_반환한다() throws Exception {
        //given
        CardPack cardPack = CardPackFactory.create();
        //when
        Card card = cardPack.getRandomCard();
        //then
        Assertions.assertThat(cardPack.contains(card)).isFalse();
    }
}
