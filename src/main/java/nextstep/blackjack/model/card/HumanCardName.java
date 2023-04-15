package nextstep.blackjack.model.card;

public enum HumanCardName {
    KING("K"),
    QUEEN("Q"),
    JACK("J");

    private final String initial;

    HumanCardName(String initial) {
        this.initial = initial;
    }

    public String getInitial() {
        return initial;
    }
}
