package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StayTest {

    @Test
    public void 비율을_반환하는_기능_구현() throws Exception {
        //given
        Stay stay = new Stay(new Cards());
        //then
        Assertions.assertThat(stay.earningRate()).isEqualTo(1f);
    }
}
