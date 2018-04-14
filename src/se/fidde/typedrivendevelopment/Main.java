package se.fidde.typedrivendevelopment;

import java.util.UUID;

import se.fidde.typedrivendevelopment.models.Order;
import se.fidde.typedrivendevelopment.models.Product;
import se.fidde.typedrivendevelopment.models.User;
import se.fidde.typedrivendevelopment.services.EmailService;
import se.fidde.typedrivendevelopment.services.ProductService;
import se.fidde.typedrivendevelopment.services.UserService;

public class Main {

	/**
	 * This is a classic flow for most of us, we start with step 1
	 * and move down the sequence until we reach the end of our program.
	 * 
	 * This is how the code runs and it is how most of us think, step by step.
	 * 
	 */
	public static void main(String[] args) {
		User user = UserService.getUser(UUID.randomUUID()); // step 1
		Product product = ProductService.getProduct(UUID.randomUUID()); // step 2
		Order order = ProductService.createOrder(user, product); // step 3
		EmailService.sendOrderPlacedEmail(order); // step 4
	}

}
