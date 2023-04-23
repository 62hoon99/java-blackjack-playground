package nextstep.blackjack.model.controller;

import nextstep.blackjack.model.user.Dealer;
import nextstep.blackjack.model.user.Participants;
import nextstep.blackjack.model.user.User;
import nextstep.blackjack.model.view.InputView;

import java.util.List;

public class GameController {

    public static void start() {
        List<User> users = InputView.participate();
        Participants participants = new Participants(users, new Dealer());
        GameSystem gameSystem = new GameSystem(participants);
        gameSystem.start();
    }
}
