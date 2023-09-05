package task7;

import java.math.BigDecimal;

public class SpecialDeposit extends Deposit {

    private double percent = 0.01;

    public SpecialDeposit(BigDecimal depositAmount, int depositPeriod, double percent) {
        super(depositAmount, depositPeriod);
        this.percent = percent;
    }

    public BigDecimal inCome(){
            int i = 1;
            BigDecimal resalt = getAmount().multiply(BigDecimal.valueOf(getPeriod()));
            while( i<= getPeriod()){
                resalt = resalt.add(resalt.multiply(BigDecimal.valueOf((percent*i))));
        }
        return resalt;
    }
}