package task7;

import java.math.BigDecimal;

public class Client {
    int n = 10;
    private Deposit [] deposits;

    public Client() {
        Deposit deposit = deposits[n];
    }

    public boolean addDeposit(Deposit deposit){
        for(int i=0; i<deposits.length; i++){
            if(deposits[i] !=null){
                deposits[i]= deposit;
                return true;
            }
        }
        return false;
    }

    public BigDecimal totalIncome(){
        BigDecimal totalIncomes = null;
        for (Deposit deposit : deposits) {
            totalIncomes.add(deposit.inCome());
        }
        return totalIncomes;
    }

    public BigDecimal maxInCome (){
        BigDecimal maxInCome = null;
        for (Deposit deposit: deposits) {
//            if (Comparable)
            if(maxInCome.compareTo() < deposit.inCome()){
                maxInCome = deposits;
            }
        }
    }



}
