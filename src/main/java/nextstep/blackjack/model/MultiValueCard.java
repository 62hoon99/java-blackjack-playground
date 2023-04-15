package nextstep.blackjack.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultiValueCard extends AbstractCard {

    private final List<Integer> value;

    public MultiValueCard(CardShape shape, String name) {
        super(shape, name);
        this.value = Arrays.asList(1, 11);
    }

    public List<Integer> getValue() {
        return Collections.unmodifiableList(value);
    }
}
