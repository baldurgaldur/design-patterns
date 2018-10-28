package factory_pattern;

import factory_pattern.pizza_stores.ChicagoStylePizzaStore;
import factory_pattern.pizza_stores.NYStylePizzaStore;
import factory_pattern.pizza_stores.PizzaStore;
import factory_pattern.pizzas.Pizza;

public class PizzaClient {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYStylePizzaStore();
    PizzaStore chicagoStore = new ChicagoStylePizzaStore();

    Pizza pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Someone ordered a " +  pizza.getName() + "pizza. \n");

    Pizza secondPizza = nyStore.orderPizza("pepperoni");
    System.out.println("Someone ordered a " +  secondPizza.getName() + "pizza. \n");
  }
}
