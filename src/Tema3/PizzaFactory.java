package Tema3;

import Tema3.pizza.*;
import Tema3.pizzaTypes.*;


public class PizzaFactory {
    private static PizzaFactory uniqueInstance;
    PizzaType pizzaTypes;
    Topping toppingTypes;
    public Observer observer;

    private PizzaFactory() {

    }

    public static PizzaFactory instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new PizzaFactory();
        }
        return uniqueInstance;
    }

    public Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CAPRICIOSA -> new Capriciosa();
            case PROSCIUTTO_FUNGHI -> new ProsciuttoFunghi();
            case QUATTRO_STAGIONI -> new QuattroStagioni();
            case MARGHERITA -> new Margherita();
        };
    }
}




