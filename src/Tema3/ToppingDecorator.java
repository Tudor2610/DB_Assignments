package Tema3;

import Tema3.pizza.Pizza;
import Tema3.pizzaTypes.Topping;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ToppingDecorator extends PizzaDecorator {
    public ToppingDecorator(Pizza pizza, ArrayList<Topping> toppings) {
        super(pizza);
        for (Topping t : toppings) {
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println(t.toString() + " has been added");
        }
        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("The pizza is in the oven!");

    }
}