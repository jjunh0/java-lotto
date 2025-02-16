package domain;

import java.util.List;

public class WinningLotto {
    private final List<Integer> winningNumbers;
    private final int bonusBall;

    public WinningLotto(List<Integer> winningNumbers, int bonusBall) {
        this.winningNumbers = winningNumbers;
        this.bonusBall = bonusBall;
    }

    public boolean containsNumber(int number) {
        return winningNumbers.contains(number);
    }

    public boolean hasBonusBall(List<Integer> numbers) {
        return numbers.contains(bonusBall);
    }
}
