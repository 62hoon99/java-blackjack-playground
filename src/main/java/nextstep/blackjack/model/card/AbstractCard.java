package nextstep.blackjack.model.card;

public abstract class AbstractCard implements Card {

    private final CardShape shape;
    private final String name;
    private boolean useCheck;

    public AbstractCard(CardShape shape, String name) {
        this.shape = shape;
        this.name = name;
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

    @Override
    public String getInfo() {
        return this.name + shape.getKor();
    }
}
