package task7;

import java.math.BigDecimal;

public class BaseDeposit extends Deposit {

    private double percent = 0.05;

    public BaseDeposit(BigDecimal depositAmount, int depositPeriod) {

        super(depositAmount, depositPeriod);
    }

    public BigDecimal inCome(){

        return getAmount().add(getAmount().multiply(BigDecimal.valueOf(percent*getPeriod())));
    }
}
