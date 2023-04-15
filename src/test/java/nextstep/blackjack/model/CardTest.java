package nextstep.blackjack.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CardTest {

    @Test
    public void 카드를_사용했는지_체크() throws Exception {
        //given
        Card card = new SingleValueCard(CardShape.SPADE, "3");
        //when
        card.use();
        //then
        assertThat(card.isUsed()).isTrue();
    }

    @Test
    public void 카드는_모양과_이름을_가진다() throws Exception {
        //given
        Card card = new SingleValueCard(CardShape.SPADE, "4");
        //then
        assertThat(card.getInfo()).isEqualTo("4스페이드");
    }
}
