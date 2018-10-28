package factory_pattern.pizzas;

public class PepperoniPizza extends CheesePizza {
  public PepperoniPizza() {
    super();
    name = "Regular Pepperoni Pizza";

    toppings.add("pepperoni");
  }
}
