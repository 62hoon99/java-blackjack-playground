package nextstep.blackjack.model.user;

import java.util.List;
import java.util.stream.Collectors;

public class Participants {

    private final List<User> users;
    private final Dealer dealer;

    public Participants(List<User> users, Dealer dealer) {
        this.users = users;
        this.dealer = dealer;
    }

    public void receiveCardEach(int count) {
        for (int i = 0; i < count; i++) {
            users.forEach(user -> user.receiveCard(dealer.getCard()));
            dealer.receiveCard(dealer.getCard());
        }
    }

    public String getUserNames() {
        List<String> names = users.stream()
                .map(User::getName)
                .collect(Collectors.toList());
        return String.join(", ", names);
    }

    public String getUserCardInfos() {
        List<String> cardInfos = users.stream()
                .map(User::cardInfo)
                .collect(Collectors.toList());
        return String.join("\n", cardInfos);
    }

    public String getDealerName() {
        return dealer.getName();
    }

    public String getDealerCardInfos() {
        return dealer.cardInfo();
    }
}
