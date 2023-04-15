package nextstep.blackjack.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    public void 카드를_사용했는지_체크() throws Exception {
        //given
        Card card = new SingleValueCard();
        //when
        card.use();
        //then
        Assertions.assertThat(card.isUsed()).isTrue();
    }
}
