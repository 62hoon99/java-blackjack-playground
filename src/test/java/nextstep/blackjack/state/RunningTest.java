package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningTest {

    @Test
    public void finished_상태인지_반환() throws Exception {
        //given
        Running hit = new Hit(new Cards());
        //then
        Assertions.assertThat(hit.isFinished()).isFalse();
    }

    @Test
    public void profit_반환() throws Exception {
        //given
        Running hit = new Hit(new Cards());
        //then
        Assertions.assertThat(hit.profit(1000f)).isEqualTo(0f);
    }
}
