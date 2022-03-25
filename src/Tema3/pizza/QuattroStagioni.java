package Tema3.pizza;

import Tema3.ToppingDecorator;
import Tema3.pizzaTypes.Topping;

import java.util.ArrayList;

public class QuattroStagioni extends Pizza{
    public ArrayList<Topping> toppings;

    public QuattroStagioni() {
        super();
        toppings = new ArrayList<>();
        toppings.add(Topping.MOZZARELLA);
        toppings.add(Topping.TOMATOES);
        toppings.add(Topping.BACON);
        toppings.add(Topping.OLIVES);
        toppings.add(Topping.MUSHROOMS);
        new ToppingDecorator(this, this.toppings);
    }
}
