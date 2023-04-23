package nextstep.blackjack.model.view;

import nextstep.blackjack.model.user.Dealer;
import nextstep.blackjack.model.user.Participants;

public class OutputView {

    public static void currentCardInfo(Participants participants) {
        System.out.println(
                participants.getDealerName() +
                        "와 " +
                        participants.getUserNames() +
                        "에게 2장의 카드를 나누었습니다.");
        System.out.println(participants.getDealerCardInfos());
        System.out.println(participants.getUserCardInfos());
    }
}
