package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

//         TODO: 프로그램 구현

        long purchaseCount = 0;
        List<List<Integer>> generatedLottoNumbers = new ArrayList<>();

        // TODO: 메서드로 분리하기
        while (true) {
            System.out.println("구입 금액을 입력하세요 : ");
            long inputAmount = Long.parseLong(Console.readLine());

            try {
                purchaseCount = Lotto.validateInputAmount(inputAmount);
                System.out.println(purchaseCount + " 개를 구매했습니다.");
                break;
            } catch (IllegalArgumentException ie) {
                System.out.println(ie.getMessage());
            }
        }

        generatedLottoNumbers = Lotto.generateLotto(purchaseCount);

        Lotto.printLottoNumbers(generatedLottoNumbers);

        while (true) {
            System.out.println("당첨 번호를 입력하세요 : ");
            String targetNumberStr = Console.readLine();


            System.out.println("보너스 번호를 입력하세요 : ");
            String bonusNumber = Console.readLine();
        }


    }

}
