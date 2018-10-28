package factory_pattern.pizza_stores;

import factory_pattern.pizzas.ChicagoStyleCheesePizza;
import factory_pattern.pizzas.ChicagoStylePepperoniPizza;
import factory_pattern.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
  @Override
  Pizza createPizza(String type) {
    switch (type) {
      case "cheese":
        return new ChicagoStyleCheesePizza();
      case "pepperoni":
        return new ChicagoStylePepperoniPizza();
      default:
        return new ChicagoStyleCheesePizza();
    }
  }
}
