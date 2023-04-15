package nextstep.blackjack.model;

public abstract class AbstractCard implements Card {

    private boolean useCheck;


    public AbstractCard() {
        this.useCheck = false;
    }

    @Override
    public void use() {
        this.useCheck = true;
    }

    @Override
    public boolean isUsed() {
        return useCheck;
    }
}
