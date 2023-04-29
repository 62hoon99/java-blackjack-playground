package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StartedTest {

    @Test
    public void 카드를_반환하는_기능() throws Exception {
        //given
        Cards cards = new Cards();
        //when
        Started started = new Hit(cards);
        //then
        Assertions.assertSame(started.cards(), cards);
    }
}
