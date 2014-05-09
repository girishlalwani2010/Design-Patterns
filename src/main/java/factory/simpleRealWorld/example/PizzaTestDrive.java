package factory.simpleRealWorld.example;

import java.util.Scanner;

public class PizzaTestDrive {
 
	public static void main(String[] args) {
		//Client Knows Only about PizzaStore...
		PizzaStore store = new PizzaStore();

		System.out.println("---Welcome to the PizzaStore----");
		System.out.println("These are the available Pizzas Currently in the Menu List:: \n 1. CheesePizza\n 2. ClamPizza\n 3. PeppironPizza\n 4. VeggiPizza  "+"\n"+"so what you want please select");
		Scanner scan = new Scanner(System.in);
		String selectedPizza = scan.next();
		Pizza pizza = store.orderPizza(selectedPizza);//examples like CheesePizza,ClamPizza............
		
		System.out.println("You ordered a " + pizza.getName() + "\n");

	}
}
