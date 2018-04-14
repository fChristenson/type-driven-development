package se.fidde.typedrivendevelopment.models;

public class Order {
	private final User user;
	private final Product product;
	private boolean orderEmailSent;
	
	public Order(User user, Product product, boolean orderEmailSent) {
		this.user = user;
		this.product = product;
		this.setOrderEmailSent(orderEmailSent);
	}

	public Product getProduct() {
		return product;
	}

	public User getUser() {
		return user;
	}

	public boolean isOrderEmailSent() {
		return orderEmailSent;
	}

	public void setOrderEmailSent(boolean orderEmailSent) {
		this.orderEmailSent = orderEmailSent;
	}
}
