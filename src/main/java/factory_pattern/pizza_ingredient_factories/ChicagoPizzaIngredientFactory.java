package factory_pattern.pizza_ingredient_factories;

import factory_pattern.pizza_ingredients.*;

import java.util.Arrays;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new Mozzarella();
  }

  @Override
  public List<Veggies> createVeggies() {
    return Arrays.asList(new Spinach(), new EggPlant(), new BlackOlives());
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
}
