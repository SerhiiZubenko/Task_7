package task7;

import java.math.BigDecimal;

public class LongDeposit extends Deposit {

    private double percent = 0.15;

    public LongDeposit(BigDecimal depositAmount, int depositPeriod, double percent) {
        super(depositAmount, depositPeriod);
        this.percent = percent;
    }

    public BigDecimal inCome() {
        BigDecimal result = getAmount();
        if (getPeriod() >= 7) {
            for (int i = 7; i <= getPeriod(); i++) {
                result = getAmount().add(getAmount().multiply(BigDecimal.valueOf((i - 6) * percent)));
            }
        }
        return result;
    }
}
