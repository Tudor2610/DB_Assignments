package Tema3.pizza;


import Tema3.ToppingDecorator;
import Tema3.pizzaTypes.Topping;

import java.util.ArrayList;

public class Capriciosa extends Pizza{
    public ArrayList<Topping> toppings;

    public Capriciosa(){
        super();
        toppings = new ArrayList<>();
        toppings.add(Topping.MOZZARELLA);
        toppings.add(Topping.TOMATOES);
        toppings.add(Topping.BACON);
        toppings.add(Topping.OLIVES);
        new ToppingDecorator(this, this.toppings);
    }
}
