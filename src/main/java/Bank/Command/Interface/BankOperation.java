package Bank.Command.Interface;

public interface BankOperation {

    void transfer();        //przelew

    void withdraw(double amount);        //wypłata

    void deposit(double amount);         //wpłata

    void closeAccount(int accountNumber);    //zamkniecie konta

    void openDebit(int accountNumber);       //otwarcie debetu
}
