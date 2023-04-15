package nextstep.blackjack.model.card;

public interface Card {

    void use();

    boolean isUsed();

    String getInfo();

    int getValue();
}
