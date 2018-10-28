package factory_pattern.pizza_stores;

import factory_pattern.pizzas.NYStyleCheesePizza;
import factory_pattern.pizzas.NYStylePepperoniPizza;
import factory_pattern.pizzas.Pizza;

public class NYStylePizzaStore extends PizzaStore {
  @Override
  Pizza createPizza(String type) {
    switch (type) {
      case "cheese":
        return new NYStyleCheesePizza();
      case "pepperoni":
        return new NYStylePepperoniPizza();
      default:
        return new NYStyleCheesePizza();
    }
  }
}
