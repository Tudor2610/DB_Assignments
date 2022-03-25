package Tema3;


import Tema3.pizza.Pizza;
import Tema3.pizzaTypes.PizzaType;

public class Client {
    public Tema3.Observer observer;
    public Pizza pizza;

    public void attachObserver(Observer observer){
        this.observer = observer;
    }

    public void notifyObserver(){
        observer.receiveUpdate();
    }

    public void orderPizza(Command c, PizzaType pizzaType){
        System.out.println("Your order has been placed!");
        c.execute(this, pizzaType);
    }

}
