package nextstep.blackjack.model.card;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardPackFactoryTest {

    @Test
    public void 카드팩을_생성한다() throws Exception {
        //given
        CardPack cardPack = CardPackFactory.create();
        //then
        Assertions.assertThat(cardPack).isInstanceOf(CardPack.class);
    }
}
