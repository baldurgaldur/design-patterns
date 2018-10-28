package factory_pattern.pizzas;

public class CheesePizza extends Pizza {
  public CheesePizza() {
    name = "Boring cheese pizza";
    dough = "Regular dough";
    sauce = "Mundane marinara sauce";

    toppings.add("oil");
  }
}
