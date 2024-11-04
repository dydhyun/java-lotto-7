package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

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
        if(inputAmount < 1000){
            throw new IllegalArgumentException("[ERROR] 투입 금액은 천원 이상으로 해주세요.");
        }
        if(inputAmount % 1000 != 0){
            throw new IllegalArgumentException("[ERROR] 투입 금액은 천원 단위로 해주세요.");
        }
        return inputAmount / 1000;
    }

    // TODO: 천원단위로 투입했는지 검증하기
    public static List<List<Integer>> generateLotto(long purchaseCount) {
        List<List<Integer>> randomLottoList = new ArrayList<>();

        if(purchaseCount < 0){
            throw new IllegalArgumentException("[ERROR] 투입 금액은 천원 이상으로 해주세요.");
        }
        for (int i = 0; i < purchaseCount; i++) {
            List<Integer> singleLotto = Randoms.pickUniqueNumbersInRange(1, 45, 6);
            Collections.sort(singleLotto);
            randomLottoList.add(singleLotto);
        }

        return randomLottoList;
    }

    // TODO: 생성된 로또 번호 출력하기
    public static void printLottoNumbers(List<List<Integer>> generatedLottoNumbers) {
        for (List<Integer> lotto : generatedLottoNumbers) {
            System.out.println(lotto);
        }
    }


}
