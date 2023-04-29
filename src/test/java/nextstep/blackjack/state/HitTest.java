package nextstep.blackjack.state;

import nextstep.blackjack.card.Card;
import nextstep.blackjack.card.Cards;
import nextstep.blackjack.card.Denomination;
import nextstep.blackjack.card.Suit;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HitTest {

    @Test
    public void draw하고_다음_상태를_반환한다() throws Exception {
        //given
        State state = new Hit(new Cards());
        //when
        State hit2 = state.draw(new Card(Suit.DIAMONDS, Denomination.JACK));
        State hit3 = hit2.draw(new Card(Suit.DIAMONDS, Denomination.JACK));
        State burst = hit3.draw(new Card(Suit.DIAMONDS, Denomination.JACK));
        //then
        assertThat(hit2).isInstanceOf(Hit.class);
        assertThat(hit3).isInstanceOf(Hit.class);
        assertThat(burst).isInstanceOf(Bust.class);
    }

    @Test
    public void stay하면_stay를_반환한다() throws Exception {
        //given
        State state = new Hit(new Cards());
        //then
        assertThat(state.stay()).isInstanceOf(Stay.class);
    }
}
