package Bank.Exception;

public class MinAmount extends RuntimeException{

    public MinAmount() {
        super("Amount should be positive");
    }
}
