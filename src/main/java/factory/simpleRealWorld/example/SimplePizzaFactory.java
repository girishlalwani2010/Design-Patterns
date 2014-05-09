package factory.simpleRealWorld.example;

public class SimplePizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("CheesePizza")) {
			pizza = new CheesePizza();
		} else if (type.equals("PepperoniPizza")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("ClamPizza")) {
			pizza = new ClamPizza();
		} else if (type.equals("VeggiePizza")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
