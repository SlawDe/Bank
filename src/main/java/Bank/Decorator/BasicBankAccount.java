package Bank.Decorator;

import Bank.BankEntity.BankService;
import Bank.BankEntity.BankServiceImpl;
import Bank.Exception.MinAmount;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class BasicBankAccount implements BankAccount {

    private static final Logger logger = LoggerFactory.getLogger(BasicBankAccount.class);

    BankService bankService = new BankServiceImpl();

    private int accountNumber;
    private double balance;
    private int accountNum;
    private String customerName;
    private double[] transactions;
    private String[] transactionsSummary;
    private int numOfTransactions;
    private static int noOfAccounts = 0;

    private Random rnd = new Random();
    double ammount = 100.00;

    public BasicBankAccount(String newCustomerName, double openingBalance) {
        customerName = newCustomerName;
        balance = openingBalance;
        noOfAccounts++;
        accountNum = noOfAccounts;
        transactions = new double[100];
        transactionsSummary = new String[1000];
        transactions[0] = balance;
        transactionsSummary[0] = "A balance of: " + Double.toString(balance) + "zł was deposited.";
        numOfTransactions = 1;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            logger.warn("Amount to be withdrawn should be positive");
            throw new MinAmount();
        } else {
            if (balance < amount) {
                logger.warn("Insufficient balance");
            } else {
                balance = balance - amount;
                transactions[numOfTransactions] = amount;
                transactionsSummary[numOfTransactions] = "zł" + Double.toString(amount) + " was withdrawn.";
                numOfTransactions++;
            }
        }
        logger.info("Wypłacono: {}zł", ammount);
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            logger.warn("Amount to be deposited should be positive");
        } else {
            balance = balance + amount;
            transactions[numOfTransactions] = amount;
            transactionsSummary[numOfTransactions] = "zł" + Double.toString(amount) + " was deposited.";
            numOfTransactions++;
        }

        logger.info("Deposited: {}zł", ammount);
    }

    @Override
    public void closeAccount(int accountNumber) {
        bankService.removeAccount(accountNumber);
        logger.info("Zamknięto konto o nr: {}", accountNumber);
    }

    @Override
    public String getDescription() {
        return "Basic Bank Account";
    }

    @Override
    public void transfer() {
        logger.info("Przelano: {}zł", ammount);
    }

    @Override
    public void openDebit(int accountNumber) {
        logger.info("Otwarto debet na koncie");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountInfo() {
        return "Account number: " + accountNum + "\nCustomer Name: " + customerName + "\nBalance:" + balance + "\n";
    }

    public String getTransactionInfo(int n) {
        String transaction = transactionsSummary[n];
        if (transaction == null) {
            return "No transaction exists with that number.";
        } else {
            return transaction;
        }
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getNumberOfTransactions() {
        return numOfTransactions;
    }

    public double getBalance() {
        return balance;
    }
}
