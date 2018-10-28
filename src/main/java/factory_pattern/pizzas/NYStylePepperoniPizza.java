package factory_pattern.pizzas;

public class NYStylePepperoniPizza extends NYStyleCheesePizza {
  public NYStylePepperoniPizza() {
    super();
    name = "NY Style Sauce and Cheese Pizza";

    toppings.add("Pepperoni");
  }
}
