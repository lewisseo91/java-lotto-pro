package lotto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class LottoResultsViewTest {
    private LottoResultsView lottoResultsView;

    @BeforeEach
    void setup() {
        BuyAmount buyAmount = new BuyAmount(14000);
        List<LottoResult> lottoResultArr = Arrays.asList(new LottoResult(3));
        LottoResults lottoResults = new LottoResults(lottoResultArr);
        lottoResultsView = new LottoResultsView(buyAmount, lottoResults);
    }

    @DisplayName("결과 통계 테스트")
    @Test
    void showLottoResults() {
        lottoResultsView.showResults();
    }

    @DisplayName("결과 총 수익 테스트")
    @Test
    void getLottoResultsRewardTotal() {
        lottoResultsView.showTotalReward();
    }

    @DisplayName("결과 수익률 테스트")
    @Test
    void getLottoResultsProfitRate() {
        lottoResultsView.showProfitRate();
    }
}