package Bank.Command;


import Bank.Command.Interface.BankCommand;
import Bank.Command.Interface.BankOperation;

public class OpenDebit implements BankCommand {

    BankOperation bankOperation;

    public OpenDebit(BankOperation bankOperation) {
        this.bankOperation = bankOperation;
    }

    @Override
    public void execute() {
       // bankOperation.openDebit();
    }
}
