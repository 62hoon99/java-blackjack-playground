package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BustTest {

    @Test
    public void 비율을_반환하는_기능_구현() throws Exception {
        //given
        Finished bust = new Bust(new Cards());
        //then
        Assertions.assertThat(bust.earningRate()).isEqualTo(0f);
    }
}