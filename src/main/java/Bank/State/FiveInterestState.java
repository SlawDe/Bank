package Bank.State;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Bank.Decorator.BasicBankAccount;

public class FiveInterestState implements InterestState {
    private Interest interest;
    private BasicBankAccount basicBankAccount;

    private static final Logger logger = LoggerFactory.getLogger(FiveInterestState.class);

    @Override
    public void calc() {
        logger.info("Oprocentowanie o wysokości 5%");

    }

    @Override
    public double calculate() {
        logger.info("Oprocentowanie o wysokości 5%");

        double interestPercent = 0.05;
        double day = interest.getDuration()*30/365;
        double zysk = (basicBankAccount.getBalance()  * interestPercent / day);
//        zysk = x * (p / 100_ * (d / 365)
//        gdzie x to kwota lokaty, p –oprocentowanie, a d –czas trwania lokaty wyrażony w dniach.
    }
    @Override
    public Interest getInvestment() {
        return interest;
    }

    @Override
    public double breakInvestment() {
        return interest.getBalance();
    }

    @Override
    public double closeInvestment() {
        return interest.getBalance()+ (calculate());
    }
}
