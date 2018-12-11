
package bookstore;

public interface ShoppingCartInterface extends BookCollectionInterface {
	public double totalPrice();
	public String checkout();
}
