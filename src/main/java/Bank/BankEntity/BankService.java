package Bank.BankEntity;

public interface BankService {

    int openNewAccount(String customerName, double openingBalance);

    void withdrawFrom(int accountNum, double amount);

    void depositTo(int accountNum, double amount);

    void printAccountInfo(int accountNum);

    void printTransactionInfo(int accountNum);

    void printAccountInfo(int accountNum, int n);

    void removeAccount(int number);

}
