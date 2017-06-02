package shopping;

public class CartItem {
	String name;
	double pricePerItem;
	int quantity;
	
	public CartItem (String itemName, double itemPrice, int itemQuantity){
		name = itemName;
		pricePerItem = itemPrice;
		quantity = itemQuantity;
	}
	
	public double totalPrice() {
		return pricePerItem * quantity;
	}
	public String toString() {
		return quantity + " " + name + " @ $" + pricePerItem;
	}
}
