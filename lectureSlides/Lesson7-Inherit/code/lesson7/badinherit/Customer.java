package lesson7.badinherit;

public class Customer {
	void aMethod() {
		ShoppingCart cart = new ShoppingCart();
		//...populate cart
		double val = Util.computeCosts(cart);
		//...
	}
}
