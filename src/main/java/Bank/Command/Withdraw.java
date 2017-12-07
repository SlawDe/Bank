package Bank.Command;


import Bank.Command.Interface.BankCommand;
import Bank.Command.Interface.BankOperation;

public class Withdraw implements BankCommand {

    BankOperation bankOperation;

    public Withdraw(BankOperation bankOperation) {
        this.bankOperation = bankOperation;
    }

    @Override
    public void execute() {
      //  bankOperation.withdraw();
    }
}
