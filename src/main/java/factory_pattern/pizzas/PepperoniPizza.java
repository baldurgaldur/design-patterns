package factory_pattern.pizzas;

import factory_pattern.pizza_ingredient_factories.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
  private PizzaIngredientFactory pizzaIngredientFactory;

  public PepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  public void prepare() {
    System.out.println("Preparing " + name);

    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();

    veggies = pizzaIngredientFactory.createVeggies();
    cheese = pizzaIngredientFactory.createCheese();
    pepperoni = pizzaIngredientFactory.createPepperoni();
  }
}
