package lotto;

public enum LottoRankingStatus {
    MATCH3(3, 5000),
    MATCH4(4, 50000),
    MATCH5(5, 1500000),
    MATCH6(6, 2000000000),
    NONE(0, 0);

    public static final String MATCH_DESCRIPTION = "%s개 일치 (%s원)- %s개";

    private final int matchAmount;
    private final int prizeAmount;

    LottoRankingStatus(int matchAmount, int prizeAmount) {
        this.matchAmount = matchAmount;
        this.prizeAmount = prizeAmount;
    }

    public int getMatchAmount() {
        return matchAmount;
    }
}