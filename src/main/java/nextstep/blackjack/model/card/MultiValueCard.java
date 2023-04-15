package nextstep.blackjack.model.card;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultiValueCard extends AbstractCard {

    private final List<Integer> value;

    public MultiValueCard(CardShape shape, String name) {
        super(shape, name);
        this.value = Arrays.asList(1, 11);
    }

    @Override
    public int getValue() {
        return this.value.get(0);
    }

    public List<Integer> getValues() {
        return Collections.unmodifiableList(value);
    }
}
