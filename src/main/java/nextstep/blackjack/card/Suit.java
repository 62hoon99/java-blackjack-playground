package nextstep.blackjack.card;

public enum Suit {
    CLUBS("클로버"),
    DIAMONDS("다이아몬드"),
    HEARTS("하트"),
    SPADES("스페이드");

    private final String kor;

    Suit(String kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return kor;
    }
}
