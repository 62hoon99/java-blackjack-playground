package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackTest {

    @Test
    public void 비율을_반환하는_기능_구현() throws Exception {
        //given
        Finished blackJack = new BlackJack(new Cards());
        //then
        Assertions.assertThat(blackJack.earningRate()).isEqualTo(1.5f);
    }
}
