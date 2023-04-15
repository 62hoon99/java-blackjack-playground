package nextstep.blackjack.model.card;

public enum CardShape {
    SPADE("스페이드"),
    CLOVER("클로버"),
    HEART("하트"),
    DIAMOND("다이아몬드");

    private final String kor;

    CardShape(String kor) {
        this.kor = kor;
    }

    public String getKor() {
        return kor;
    }
}
