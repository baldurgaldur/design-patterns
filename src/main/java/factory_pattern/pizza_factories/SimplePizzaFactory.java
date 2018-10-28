package factory_pattern.pizza_factories;

import factory_pattern.pizzas.CheesePizza;
import factory_pattern.pizzas.PepperoniPizza;
import factory_pattern.pizzas.Pizza;

public class SimplePizzaFactory {
  public Pizza createPizza(String type) {
    switch (type) {
      case "cheese":
        return new CheesePizza();
      case "pepperoni":
        return new PepperoniPizza();
      default:
        return new CheesePizza();
    }
  }
}
