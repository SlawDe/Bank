package Trash.PizzaDecorator;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce (Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce");
    }

    public String getDescription(){
        return tempPizza.getDescription()+ ", Tomato Sauce";
    }

    public double getCost(){
        System.out.println("Cost of Sauce: " + .75);
        return tempPizza.getCost() + .75;
    }
}
