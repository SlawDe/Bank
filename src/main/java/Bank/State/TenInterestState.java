package Bank.State;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Bank.Decorator.BasicBankAccount;

public class TenInterestState implements InterestState {
    private Interest interest;
    private BasicBankAccount basicBankAccount;

    private static final Logger logger = LoggerFactory.getLogger(TenInterestState.class);

    @Override
    public double calculate() {
        logger.info("Oprocentowanie o wysokości 10%");

        double interestPercent = 0.1;
        double day = interest.getDuration()*30/365;
        double zysk = (basicBankAccount.getBalance()  * interestPercent / day);
        return zysk;
//        zysk = x * (p / 100_ * (d / 365)
//        gdzie x to kwota lokaty, p –oprocentowanie, a d –czas trwania lokaty wyrażony w dniach.
    }
    @Override
    public Interest getInterest() {
        return interest;
    }

    @Override
    public double breakInterest() {
        return interest.getBalance();
    }

    @Override
    public double closeInterest() {
        return interest.getBalance()+ (calculate());
    }
}
