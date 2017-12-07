package Bank.Command;


import Bank.Command.Interface.BankCommand;
import Bank.Command.Interface.BankOperation;

public class Transfer implements BankCommand {

    BankOperation bankOperation;

    public Transfer(BankOperation bankOperation) {
        this.bankOperation = bankOperation;
    }

    @Override
    public void execute() {
        bankOperation.transfer();
    }
}
