package Bank.BankEntity;

import Bank.Decorator.BasicBankAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class BankServiceImpl implements BankService {

    private static final Logger logger = LoggerFactory.getLogger(BankServiceImpl.class);

    private Bank bank = new Bank();
    private BasicBankAccount[] accounts;
    private int numOfAccounts;

    @Override
    public int openNewAccount(String customerName, double openingBalance) {
        BasicBankAccount newBankAccount = new BasicBankAccount(customerName, openingBalance);
        accounts[numOfAccounts] = newBankAccount;
        numOfAccounts++;
        return newBankAccount.getAccountNum();
    }

    @Override
    public void withdrawFrom(int accountNum, double amount) {
        accounts = bank.getAccounts();

        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                accounts[i].withdraw(amount);
                logger.info("Amount withdrawn successfully");
                return;
            }
        }
        logger.warn("Account number not found.");
    }

    @Override
    public void depositTo(int accountNum, double amount) {
        accounts = bank.getAccounts();

        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                accounts[i].deposit(amount);
                logger.info("Amount deposited successfully");
                return;
            }
        }
        logger.warn("Account number not found.");
    }

    @Override
    public void printAccountInfo(int accountNum) {
        accounts = bank.getAccounts();

        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                logger.info(accounts[i].getAccountInfo());
                return;
            }
        }
        logger.warn("Account number not found.");
    }

    @Override
    public void printTransactionInfo(int accountNum) {
        accounts = bank.getAccounts();

        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                logger.info(accounts[i].getAccountInfo());
                logger.info("Last transaction: " + accounts[i].getTransactionInfo(accounts[i].getNumberOfTransactions() - 1));
                return;
            }
        }
        logger.warn("Account number not found.");
    }

    @Override
    public void printAccountInfo(int accountNum, int n) {
        accounts = bank.getAccounts();

        for (int i = 0; i < numOfAccounts; i++) {
            if (accountNum == accounts[i].getAccountNum()) {
                logger.info(accounts[i].getAccountInfo());
                logger.info(accounts[i].getTransactionInfo(n));
                return;
            }
        }
        logger.warn("Account number not found.");
    }

    @Override
    public void removeAccount(int number) {
        accounts = bank.getAccounts();

        List<BasicBankAccount> list = Arrays.asList(accounts);
        for (BasicBankAccount account : accounts) {
            if (account.getAccountNum() == number)
                list.remove(account);
        }

        list.toArray(accounts);
    }
}
