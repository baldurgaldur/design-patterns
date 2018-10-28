package factory_pattern.pizza_ingredient_factories;

import factory_pattern.pizza_ingredients.*;

import java.util.List;

// Abstract Factory
public interface PizzaIngredientFactory {

  // Factory Methods: (using classes to create, factory method style)
  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  List<Veggies> createVeggies();

  Pepperoni createPepperoni();
}
