package Bank.BankEntity;

import Bank.Decorator.BasicBankAccount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Bank {

    private static final Logger logger = LoggerFactory.getLogger(Bank.class);

    private int bankSSN;
    private BasicBankAccount[] accounts;
    private int numOfAccounts;

    Bank() {
        bankSSN = 0;
        accounts = new BasicBankAccount[100];
        numOfAccounts = 0;
    }

    public int getBankSSN() {
        return bankSSN;
    }

    public void setBankSSN(int bankSSN) {
        this.bankSSN = bankSSN;
    }

    public BasicBankAccount[] getAccounts() {
        return accounts;
    }

    public void setAccounts(BasicBankAccount[] accounts) {
        this.accounts = accounts;
    }

    public int getNumOfAccounts() {
        return numOfAccounts;
    }

    public void setNumOfAccounts(int numOfAccounts) {
        this.numOfAccounts = numOfAccounts;
    }
}
