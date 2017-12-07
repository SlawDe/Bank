package Bank.Command;


import Bank.Command.Interface.BankCommand;
import Bank.Command.Interface.BankOperation;

public class CloseAccount implements BankCommand {

    BankOperation bankOperation;

    private int accountNumber;

    public CloseAccount(BankOperation bankOperation, int accountNumber) {
        this.bankOperation = bankOperation;
        this.accountNumber = accountNumber;
    }

    @Override
    public void execute() {
        bankOperation.closeAccount(accountNumber);
    }
}
