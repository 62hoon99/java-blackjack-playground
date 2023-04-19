package nextstep.blackjack.user;

import nextstep.blackjack.model.card.CardName;
import nextstep.blackjack.model.card.CardShape;
import nextstep.blackjack.model.card.SingleValueCard;
import nextstep.blackjack.model.user.Player;
import nextstep.blackjack.model.user.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void 카드를_받는_기능() throws Exception {
        //given
        User pobi = new Player("pobi", 10000);
        //when
        pobi.receiveCard(
                new SingleValueCard(CardShape.SPADE, CardName.FIVE),
                new SingleValueCard(CardShape.CLOVER, CardName.JACK)
        );
        //then
        Assertions.assertThat(pobi.cardInfo()).isEqualTo("pobi카드: 5스페이드, J클로버");
    }
}
