package lotto;

public class Application {
    public static void main(String[] args) {

//         TODO: 프로그램 구현

        while (true) {
            System.out.println("구입 금액을 입력하세요 : ");
            long inputAmount = Long.parseLong(camp.nextstep.edu.missionutils.Console.readLine());

            try {
                long count = Lotto.validateInputAmount(inputAmount);
                System.out.println(count + " 회 진행합니다.");
                break;
            } catch (IllegalArgumentException ie) {
                System.out.println(ie.getMessage());
            }
        }

        while (true) {
            System.out.println("당첨 번호를 입력하세요 : ");
            String targetNumberStr = camp.nextstep.edu.missionutils.Console.readLine();


            System.out.println("보너스 번호를 입력하세요 : ");
            String bonusNumber = camp.nextstep.edu.missionutils.Console.readLine();
        }


    }

}
