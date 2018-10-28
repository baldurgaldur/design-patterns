package factory_pattern.pizzas;

import factory_pattern.pizza_ingredient_factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
  private PizzaIngredientFactory ingredientFactory;

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public void prepare() {
    System.out.println("Preparing " + name);

    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();

    veggies = ingredientFactory.createVeggies();
    cheese = ingredientFactory.createCheese();
  }
}
