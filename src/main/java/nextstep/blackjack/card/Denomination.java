package nextstep.blackjack.card;

public enum Denomination {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final int score;

    Denomination(final int score) {
        this.score = score;
    }

    public boolean isAce() {
        return this == ACE;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        if (score == 10 || isAce()) {
            return String.valueOf(name().charAt(0));
        }
        return String.valueOf(score);
    }
}