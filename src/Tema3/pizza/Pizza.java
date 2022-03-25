package Tema3.pizza;

import Tema3.pizzaTypes.Topping;

import java.util.ArrayList;

public class Pizza {
    public ArrayList<Topping> toppings;
    public Pizza(){
        toppings = new ArrayList<>();
        toppings.add(Topping.NO_TOPPING);
    }
}
