package nextstep.blackjack.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class DenominationTest {

    @Test
    public void score를_반환한다() throws Exception {
        //then
        assertThat(Denomination.EIGHT.getScore()).isEqualTo(8);
        assertThat(Denomination.KING.getScore()).isEqualTo(10);
    }

    @Test
    public void ace인지_반환() throws Exception {
        //then
        assertThat(Denomination.ACE.isAce()).isTrue();
        assertThat(Denomination.FIVE.isAce()).isFalse();
    }
}
