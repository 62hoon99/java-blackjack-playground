package nextstep.blackjack.user;

import nextstep.blackjack.card.Card;
import nextstep.blackjack.card.Denomination;
import nextstep.blackjack.card.Suit;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void 현재_보유한_카드를_반환한다() throws Exception {
        //given
        User player = new Player("pobi", 10000);
        Card[] cards = {new Card(Suit.CLUBS, Denomination.JACK), new Card(Suit.DIAMONDS, Denomination.ACE)};
        //when
        player.draw(cards);
        //then
        Assertions.assertThat(player.toString()).isEqualTo("pobi카드: J클로버, A다이아몬드");
    }
}
