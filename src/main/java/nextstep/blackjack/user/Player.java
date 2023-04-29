package nextstep.blackjack.user;

public class Player extends AbstractUser {

    public Player(String name, int battingMoney) {
        super(name, battingMoney);
    }

    @Override
    public String toString() {
        return name + "카드: " + state.cards().toString();
    }
}
