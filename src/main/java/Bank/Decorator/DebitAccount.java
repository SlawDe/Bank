package Bank.Decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebitAccount extends BankAccountDecorator {

    private static final Logger logger = LoggerFactory.getLogger(DebitAccount.class);

    double ammount = 155.00;

    public DebitAccount(BankAccount bankAccount) {
        super(bankAccount);
    }

    public String getDescription() {
        return tempBankAccount.getDescription() + " Plus Debit Account";
    }

    @Override
    public void transfer() {
        logger.info("Przelano: {}zł", ammount);
    }

    @Override
    public void withdraw(double amount) {
        logger.info("Wypłacono: {}zł", ammount);
    }

    @Override
    public void deposit(double amount) {
        logger.info("Wpłacono: {}zł", ammount);
    }

    @Override
    public void closeAccount(int accountNumber) {
        logger.info("Zamknięto konto");
    }

    @Override
    public void openDebit(int accountNumber) {
        logger.info("Otwarto debet na koncie");
    }

}
