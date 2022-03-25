package Tema3;

import Tema3.pizza.Pizza;

import java.util.concurrent.TimeUnit;

public class PizzaDecorator extends Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("The dough is being prepared!");
    }
}
