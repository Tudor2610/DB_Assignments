package Tema3.pizza;

import Tema3.ToppingDecorator;
import Tema3.pizzaTypes.Topping;

import java.util.ArrayList;

public class Margherita extends Pizza{
    public ArrayList<Topping> toppings;

    public Margherita(){
        super();
        toppings.add(Topping.MOZZARELLA);
        toppings.add(Topping.TOMATOES);
        new ToppingDecorator(this, this.toppings);
    }
}
