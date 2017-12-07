package Bank.State;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Bank.Decorator.BasicBankAccount;

public class TenInterestState implements InterestState {
    private Interest interest;
    private BasicBankAccount basicBankAccount;

    private static final Logger logger = LoggerFactory.getLogger(TenInterestState.class);

    @Override
    public void calc() {
        logger.info("Oprocentowanie o wysokości 10%");

        double interestPercent = 0.10;
        double day = interest.getDuration()*30/365;
        double zysk = (basicBankAccount.getBalance()  * interestPercent / day);
    }
}
