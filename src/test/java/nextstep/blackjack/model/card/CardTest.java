package nextstep.blackjack.model.card;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CardTest {

    @Test
    public void 카드를_사용했는지_체크() throws Exception {
        //given
        Card card = new SingleValueCard(CardShape.SPADE, CardName.EIGHT);
        //when
        card.use();
        //then
        assertThat(card.isUsed()).isTrue();
    }

    @Test
    public void 카드는_모양과_이름을_가진다() throws Exception {
        //given
        Card spadeCard = new SingleValueCard(CardShape.SPADE, CardName.FOUR);
        SingleValueCard cloverCard = new SingleValueCard(CardShape.CLOVER, CardName.FIVE);
        SingleValueCard heartCard = new SingleValueCard(CardShape.HEART, CardName.KING);
        SingleValueCard diamondCard = new SingleValueCard(CardShape.DIAMOND, CardName.JACK);
        //then
        assertThat(spadeCard.getInfo()).isEqualTo("4스페이드");
        assertThat(cloverCard.getInfo()).isEqualTo("5클로버");
        assertThat(heartCard.getInfo()).isEqualTo("K하트");
        assertThat(diamondCard.getInfo()).isEqualTo("J다이아몬드");
    }

    @Test
    public void single_value_card_숫자_반환() throws Exception {
        //given
        SingleValueCard singleNumberCard = new SingleValueCard(CardShape.CLOVER, CardName.FIVE);
        SingleValueCard kingNumberCard = new SingleValueCard(CardShape.CLOVER, CardName.KING);
        //then
        assertThat(singleNumberCard.getValue()).isEqualTo(5);
        assertThat(kingNumberCard.getValue()).isEqualTo(10);
    }

    @Test
    public void multi_value_card_숫자_반환() throws Exception {
        //given
        MultiValueCard multiValueCard = new MultiValueCard(CardShape.CLOVER, "A");
        //then
        assertThat(multiValueCard.getValues()).contains(1, 11);
    }
}
