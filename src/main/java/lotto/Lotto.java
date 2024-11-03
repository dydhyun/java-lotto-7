package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    // TODO: 추가 기능 구현

    // TODO: 천원단위로 투입했는지 검증하기
    public static long validateInputAmount(long inputAmount) {
        if(inputAmount % 1000 != 0){
            throw new IllegalArgumentException("[ERROR] 투입 금액은 천원 단위로 해주세요.");
        }
        return inputAmount / 1000;
    }

}
