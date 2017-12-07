package Bank.Decorator;

abstract class BankAccountDecorator implements BankAccount {

    protected BankAccount tempBankAccount;

    public BankAccountDecorator(BankAccount tempBankAccount) {
        this.tempBankAccount = tempBankAccount;
    }

    public String getDescription() {
        return tempBankAccount.getDescription();
    }
}
