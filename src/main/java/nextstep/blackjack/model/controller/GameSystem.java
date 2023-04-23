package nextstep.blackjack.model.controller;

import nextstep.blackjack.model.user.Participants;
import nextstep.blackjack.model.view.OutputView;

public class GameSystem {

    private final Participants participants;

    public GameSystem(Participants participants) {
        this.participants = participants;
    }

    public void start() {
        participants.receiveCardEach(2);
        OutputView.currentCardInfo(participants);
    }
}
