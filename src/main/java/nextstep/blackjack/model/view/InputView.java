package nextstep.blackjack.model.view;

import nextstep.blackjack.model.user.Player;
import nextstep.blackjack.model.user.User;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final String NUMBER_FORMAT_EXCEPTION_MSG = "숫자를 입력해 주세요.";
    private static final String BETTING_MONEY_MSG = "의 배팅 금액은?";
    private static final Scanner scanner = new Scanner(System.in);

    public static List<User> participate() {
        List<String> names = getNames();
        return getUsers(names);
    }

    private static List<User> getUsers(List<String> names) {
        return names.stream()
                .map(name -> {
                    System.out.println(name + BETTING_MONEY_MSG);
                    int money = getMoney();
                    return new Player(name, money);
                })
                .collect(Collectors.toList());
    }

    private static List<String> getNames() {
        String names = scanner.nextLine();
        return Arrays.asList(names.split(","));
    }

    private static int getMoney() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NUMBER_FORMAT_EXCEPTION_MSG);
        }
    }
}
