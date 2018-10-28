package factory_pattern.pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<>();

  public void prepare() {
    System.out.println("Preparing " + name);
    System.out.println("Tossing dough.. ");
    System.out.println("Adding toppings: ");

    toppings.forEach(System.out::println);
  }

  public void bake() {
    System.out.println("Baking for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place the pizza in official Pizzastore box");
  }

  public String getName() {
    return name;
  }
}
