package factory_pattern.pizzas;

public class ChicagoStylePepperoniPizza extends ChicagoStyleCheesePizza {
  public ChicagoStylePepperoniPizza() {
    super();
    name = "Chicago Style Deep Dish Pepperoni Pizza";

    toppings.add("Pepperoni");
  }
}
