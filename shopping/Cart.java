package shopping;

import java.util.List;
import java.util.ArrayList;

public class Cart {

	List<CartItem> items = new ArrayList<CartItem>();
	
	public void addItem(CartItem item) {
		items.add(item);
	}
	
	public String toString() {
		return "Cart with items: " + items;
	}
	
	public double totalPrice() {
		double cartPrice = 0;
		for(CartItem current: items) {
			cartPrice = cartPrice + current.totalPrice();
		}
		return cartPrice;
	}
}
