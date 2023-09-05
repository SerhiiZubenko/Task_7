package task7;

import java.math.BigDecimal;

public abstract class Deposit {

    private BigDecimal amount;
    private int period;

    public BigDecimal getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public Deposit(BigDecimal depositAmount, int depositPeriod) {
        this.amount = depositAmount;
        this.period = depositPeriod;
    }

    public abstract BigDecimal inCome();

    @Override
    public String toString() {
        return "task7.Deposit{" +
                "amount=" + amount +
                ", period=" + period +
                '}';
    }
}
