package domain;

import java.util.Collections;
import java.util.List;

public class LottoDto {
    private final List<Integer> numbers;
    public LottoDto(List<Integer> numbers) {
        this.numbers = List.copyOf(numbers);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}
