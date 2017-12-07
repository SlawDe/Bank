package Bank;

import Bank.Decorator.BasicBankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    private int id;
    private String name;
    private String surname;
    private String pesel;
    private List<BasicBankAccount> bankAccontList = new ArrayList<BasicBankAccount>();
    private Random rnd = new Random();

    public Client() {}

  /*  public Client(String name, String surname, String pesel) {
        this.id = rnd.nextInt(1000) + 1;
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        BasicBankAccount bankAccount = new BasicBankAccount();
        this.bankAccontList.add(bankAccount);
    }*/
}
