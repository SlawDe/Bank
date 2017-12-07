package Bank.Command;


import Bank.Command.Interface.BankCommand;
import Bank.Command.Interface.BankOperation;

public class Deposit implements BankCommand {

    BankOperation bankOperation;

    public Deposit(BankOperation bankOperation) {
        this.bankOperation = bankOperation;
    }

    @Override
    public void execute() {
     //   bankOperation.deposit();
    }
}
