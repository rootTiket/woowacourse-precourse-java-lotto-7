package lotto.view;

import java.util.List;
import lotto.Lotto;

public class OutputView {
    public void printResult(String result) {
        System.out.println(result);
    }

    public void printLottos(List<Lotto> lottos) {
        System.out.println(lottos.size() + "개를 구매했습니다.");
        lottos.forEach(System.out::println);
    }
    
}