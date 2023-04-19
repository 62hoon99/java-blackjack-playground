package nextstep.blackjack.user;

import nextstep.blackjack.model.card.Card;
import nextstep.blackjack.model.user.Dealer;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class DealerTest {

    @Test
    public void 카드를_나눠주는_기능() throws Exception {
        //given
        Dealer dealer = new Dealer();
        //then
        Assertions.assertThat(dealer.getCard()).isInstanceOf(Card.class);
    }
}
