package nextstep.blackjack.user;

import nextstep.blackjack.model.card.CardName;
import nextstep.blackjack.model.card.CardShape;
import nextstep.blackjack.model.card.MultiValueCard;
import nextstep.blackjack.model.card.SingleValueCard;
import nextstep.blackjack.model.user.Player;
import nextstep.blackjack.model.user.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

    private User pobi;
    private User crong;

    @BeforeEach
    public void set() {
        this.pobi = new Player("pobi", 10000);
        this.pobi.receiveCard(
                new SingleValueCard(CardShape.SPADE, CardName.FIVE),
                new SingleValueCard(CardShape.CLOVER, CardName.JACK)
        );

        this.crong = new Player("crong", 20000);
        this.crong.receiveCard(
                new SingleValueCard(CardShape.HEART, CardName.SEVEN),
                new MultiValueCard(CardShape.CLOVER, "A")
        );
    }

    @Test
    public void 카드를_받는_기능() throws Exception {
        //then
        Assertions.assertThat(pobi.cardInfo()).isEqualTo("pobi카드: 5스페이드, J클로버");
    }

    @Test
    public void 카드_숫자를_계산하는_기능() throws Exception {
        //then
        Assertions.assertThat(pobi.getNumber()).isEqualTo(15);
        Assertions.assertThat(crong.getNumber()).isEqualTo(8);
    }
}
