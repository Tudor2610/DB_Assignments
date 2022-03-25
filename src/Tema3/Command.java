package Tema3;

import Tema3.pizzaTypes.PizzaType;

public class Command {
    PizzaFactory factory;

    public Command(PizzaFactory factory) {
        this.factory = factory;
    }

    public void execute (Client client, PizzaType pizzaType){
        client.pizza = factory.createPizza(pizzaType);
    }

}

