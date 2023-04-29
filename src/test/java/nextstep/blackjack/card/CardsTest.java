package nextstep.blackjack.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardsTest {

    @Test
    public void score_합산을_반환한다() throws Exception {
        //given
        Cards cards = new Cards();
        //when
        cards.add(new Card(Suit.CLUBS, Denomination.EIGHT));
        cards.add(new Card(Suit.DIAMONDS, Denomination.KING));
        //then
        Assertions.assertThat(cards.getScore()).isEqualTo(18);
    }

    @Test
    public void score_합산_시에_ACE가_11로_계산되면_21보다_클_때는_1로_계산한다() throws Exception {
        //given
        Cards cards = new Cards();
        //when
        cards.add(new Card(Suit.CLUBS, Denomination.FIVE));
        cards.add(new Card(Suit.DIAMONDS, Denomination.SIX));
        cards.add(new Card(Suit.HEARTS, Denomination.ACE));
        //then
        Assertions.assertThat(cards.getScore()).isEqualTo(12);
    }

    @Test
    public void score_합산_시에_ACE가_11로_계산되어도_21보다_같거나_작으면_11로_계산한다() throws Exception {
        //given
        Cards cards = new Cards();
        //when
        cards.add(new Card(Suit.CLUBS, Denomination.FIVE));
        cards.add(new Card(Suit.DIAMONDS, Denomination.FIVE));
        cards.add(new Card(Suit.DIAMONDS, Denomination.ACE));
        //then
        Assertions.assertThat(cards.getScore()).isEqualTo(21);
    }

    @Test
    public void score_합산_시에_ACE가_여러개일때도_21보다_같거나_작으면_11로_계산한다() throws Exception {
        //given
        Cards cards = new Cards();
        //when
        cards.add(new Card(Suit.CLUBS, Denomination.NINE));
        cards.add(new Card(Suit.DIAMONDS, Denomination.ACE));
        cards.add(new Card(Suit.DIAMONDS, Denomination.ACE));
        //then
        Assertions.assertThat(cards.getScore()).isEqualTo(21);
    }
}
