package Trash.VisitorExample;

public class Tobacco implements Visitable{

    private double price;

    public Tobacco(double item) {
        price = item;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }
}
