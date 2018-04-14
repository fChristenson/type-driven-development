package se.fidde.typedrivendevelopment.services;

import java.util.UUID;

import se.fidde.typedrivendevelopment.models.Order;
import se.fidde.typedrivendevelopment.models.Product;
import se.fidde.typedrivendevelopment.models.User;

public class ProductService {
	public static Order createOrder(User user, Product product) {
		// save order to db
		return new Order(user, product, false);
	}
	
	public static Product getProduct(UUID id) {
		return new Product();
	}
}
