package nextstep.blackjack.model;

public enum CardShape {
    SPADE("스페이드");

    private final String kor;

    CardShape(String kor) {
        this.kor = kor;
    }

    public String getKor() {
        return kor;
    }
}
