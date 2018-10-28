package factory_pattern.pizza_ingredient_factories;

import factory_pattern.pizza_ingredients.*;

import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public List<Veggies> createVeggies() {
    return Arrays.asList(new Garclic(), new Onion(), new Mushroom(), new RedPepper());
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
}
