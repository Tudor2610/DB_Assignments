package Tema3;

import Tema3.pizzaTypes.PizzaType;

import java.util.concurrent.TimeUnit;

import static Tema3.PizzaFactory.instance;

public class Test {
    public static void main(String[] args) {
        instance();
        Client client = new Client();
        client.attachObserver(new Observer(client));
        client.orderPizza(new Command(instance()), PizzaType.QUATTRO_STAGIONI);
        try{
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        client.notifyObserver();
    }
}
