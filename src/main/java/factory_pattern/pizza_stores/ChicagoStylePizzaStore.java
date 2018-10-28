package factory_pattern.pizza_stores;

import factory_pattern.pizza_ingredient_factories.ChicagoPizzaIngredientFactory;
import factory_pattern.pizza_ingredient_factories.PizzaIngredientFactory;
import factory_pattern.pizzas.CheesePizza;
import factory_pattern.pizzas.PepperoniPizza;
import factory_pattern.pizzas.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
  private PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

  @Override
  Pizza createPizza(String type) {
    Pizza pizza;

    switch (type) {
      case "cheese": {
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
      }
      case "pepperoni": {
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("Chicago Style Pepperoni Pizza");
      }
      default:{
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
      }
      return pizza;
    }
  }
}
