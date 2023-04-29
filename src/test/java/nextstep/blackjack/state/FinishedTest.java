package nextstep.blackjack.state;

import nextstep.blackjack.card.Cards;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
