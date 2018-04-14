package se.fidde.typedrivendevelopment.services;

import se.fidde.typedrivendevelopment.models.Order;
import se.fidde.typedrivendevelopment.models.Result;

public class EmailService {
	public static void sendOrderPlacedEmail(Order order) {
		// we send an email
	}
	
	public static Result<Order> sendOrderPlacedEmail2(Order order) {
		// we send email
		try {
			order.setOrderEmailSent(true);
			return Result.right(order);
		} catch(Exception e) {
			return Result.left(e);
		}
	}
}
