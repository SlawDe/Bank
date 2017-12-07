package Bank.Decorator;


import Bank.Command.Interface.BankOperation;

public interface BankAccount extends BankOperation {

    String getDescription();

}
