package nextstep.blackjack.state;

import nextstep.blackjack.card.Card;
import nextstep.blackjack.card.Cards;
import nextstep.blackjack.card.Denomination;
import nextstep.blackjack.card.Suit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinishedTest {

    @Test
    public void state에_따른_profit_반환() throws Exception {
        //given
        State bust = new Bust(new Cards());
        BlackJack blackJack = new BlackJack(new Cards());
        Stay stay = new Stay(new Cards());
        //when
        double battingMoney = 1000;
        //then
        Assertions.assertThat(bust.profit(battingMoney)).isEqualTo(0f);
        Assertions.assertThat(blackJack.profit(battingMoney)).isEqualTo(1500f);
        Assertions.assertThat(stay.profit(battingMoney)).isEqualTo(1000f);
    }

    @Test
    public void draw하면_예외를_반환() throws Exception {
        //given
        Finished blackJack = new BlackJack(new Cards());
        //then
        Assertions.assertThatThrownBy(() -> blackJack.draw(new Card(Suit.DIAMONDS, Denomination.JACK)))
                .isInstanceOf(IllegalStateException.class);
    }

    @Test
    public void stay하면_현재_인스턴스를_그대로_반환() throws Exception {
        //given
        Finished stay = new Stay(new Cards());
        //then
        assertSame(stay, stay.stay());
    }

    @Test
    public void finished상태_인지_확인() throws Exception {
        //given
        Finished stay = new Stay(new Cards());
        //then
        Assertions.assertThat(stay.isFinished()).isTrue();
    }
}
