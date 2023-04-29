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

    @Test
    public void 결과를_반환한다() throws Exception {
        //given
        User pobi = new Player("pobi", 10000);
        User crong = new Player("crong", 10000);
        Card[] cards21 = {new Card(Suit.CLUBS, Denomination.JACK), new Card(Suit.DIAMONDS, Denomination.ACE)};
        Card[] cards12 = {new Card(Suit.CLUBS, Denomination.ACE), new Card(Suit.DIAMONDS, Denomination.ACE)};
        //when
        pobi.draw(cards21);
        crong.draw(cards12);
        //then
        Assertions.assertThat(pobi.result()).isEqualTo(21);
        Assertions.assertThat(crong.result()).isEqualTo(12);
    }
}
