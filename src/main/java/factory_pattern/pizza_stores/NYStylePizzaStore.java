package factory_pattern.pizza_stores;

import factory_pattern.pizza_ingredient_factories.NYPizzaIngredientFactory;
import factory_pattern.pizza_ingredient_factories.PizzaIngredientFactory;
import factory_pattern.pizzas.CheesePizza;
import factory_pattern.pizzas.PepperoniPizza;
import factory_pattern.pizzas.Pizza;

public class NYStylePizzaStore extends PizzaStore {
  private PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

  //Factory method
  @Override
  Pizza createPizza(String type) {
    Pizza pizza;
    switch (type) {
      case "cheese": {
        // Using objects to create(Abstract factory style):
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("New York Style Cheese");
      }
      case "pepperoni": {
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("New York Style Pepperoni");
      }
      default:
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("New York Style Cheese");
    }
    return pizza;
  }
}
