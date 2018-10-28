package factory_pattern.pizza_stores;

import factory_pattern.pizzas.Pizza;

public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  // Factory Method Pattern
  abstract Pizza createPizza(String type);
}
