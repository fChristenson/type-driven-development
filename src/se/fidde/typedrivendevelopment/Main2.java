package se.fidde.typedrivendevelopment;

import java.util.UUID;

import se.fidde.typedrivendevelopment.models.Order;
import se.fidde.typedrivendevelopment.models.Product;
import se.fidde.typedrivendevelopment.models.Result;
import se.fidde.typedrivendevelopment.models.User;
import se.fidde.typedrivendevelopment.services.EmailService;
import se.fidde.typedrivendevelopment.services.ProductService;
import se.fidde.typedrivendevelopment.services.UserService;

public class Main2 {

	/**
	 * What if we used a function like mindset when we wrote code?
	 * 
	 * In functional programming there is an input and an output for every operation,
	 * what if we build on that idea?
	 * 
	 * What if we started by declaring what we have and then we declare what we
	 * expect when our program is done?
	 * 
	 * There is probably a name for this idea but I just call it type driven
	 * development.
	 */
	public static void main(String[] args) throws Exception {
		// My desire is to "transform" a user in to the result of having
		// an order placed and an email sent to the user
		User user = UserService.getUser(UUID.randomUUID()); // step 1
		
		// these steps are just a formality, we don't even think about them when
		// we first start programming, step 1 and 2 are all we care about
		Product product = ProductService.getProduct(UUID.randomUUID()); // step 5
		Order order = ProductService.createOrder(user, product); // step 4
		
		// My desire to reach step 2 make me think about what needs to happen
		// before step 2 and what shape my data needs to be in for me to know
		// what happened, this brings me to step 3
		Result<Order> result = EmailService.sendOrderPlacedEmail2(order); // step 3 
		
		// We create a result class so that in step 2 we can know if our program worked or not
		// this allows us to decide what to do before we write any code at all
		
		if(result.getResults() == null) { // step 2
			throw result.getError();
		} else {
			boolean wasSent = result.getResults().isOrderEmailSent();
			String email = result.getResults().getUser().getEmail();
			System.out.println(String.format("Email was sent to %s == %s", email, wasSent));
		}
	}

}
