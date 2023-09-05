package task7;

import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class Programm {

    public static void main(String[] args) {

        BaseDeposit bd1 = new BaseDeposit(new BigDecimal(1000), 4);
        BaseDeposit bd2 = new BaseDeposit(new BigDecimal(3000), 4);
         SpecialDeposit sd3 = new SpecialDeposit(new BigDecimal(1001), 2);
        SpecialDeposit sd4 = new SpecialDeposit(new BigDecimal(6000), 4);
         LongDeposit ld5 = new LongDeposit(new BigDecimal(2000), 40);
       BaseDeposit bd6 = new BaseDeposit(new BigDecimal(3000), 4);
        BaseDeposit bd7 = new BaseDeposit(new BigDecimal(3000), 2);
        SpecialDeposit sd8 = new SpecialDeposit(new BigDecimal(5000), 2);
        SpecialDeposit sd9 = new SpecialDeposit(new BigDecimal(6000), 4);
        LongDeposit ld10 = new LongDeposit(new BigDecimal(2000), 3);

        Client zubenko = new Client();
        zubenko.addDeposit(bd1);
        zubenko.addDeposit(bd2);
        zubenko.addDeposit(sd3);
        zubenko.addDeposit(sd4);
        zubenko.addDeposit(ld5);
        zubenko.addDeposit(bd6);
        zubenko.addDeposit(bd7);
        zubenko.addDeposit(sd8);
        zubenko.addDeposit(sd9);
        zubenko.addDeposit(ld10);

        System.out.println(zubenko.);



    }
}
