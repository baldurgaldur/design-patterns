package factory_pattern.pizzas;

import factory_pattern.pizza_ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
  String name;
  Dough dough;
  Sauce sauce;
  List<Veggies> veggies = new ArrayList<>();
  Cheese cheese;
  Pepperoni pepperoni;

  public abstract void prepare();

  public void bake() {
    System.out.println("Baking for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place the pizza in official PizzaStore box");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
