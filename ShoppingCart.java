package bookstore;
import java.util.HashSet;
import java.util.Currency;
import org.w3c.dom.Element;
/**
 *
 * @author gopbc
 */
public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    private Catalog catalog;

    public ShoppingCart(Catalog catinit) {
        this.catalog = catinit;
        
        for (StockInterface element : this.catalog.collection){
            if (element instanceof Stock){
                Stock stock = (Stock) element;
                Stock newStock = new Stock(stock.getBook(), 
                    stock.numberOfCopies(), stock.getPrice(), stock.getCurrency());
                this.collection.add(newStock);
            }
        }
    }
   
    public void addCopies(int numberOfCopies, String booktitle) {
        Stock stock = getStock(booktitle);
        stock.addCopies(numberOfCopies);
    }

    public void removeCopies(int numberOfCopies, String booktitle) {
        Stock stock = getStock(booktitle);
        stock.removeCopies(numberOfCopies);
    }
    
    public double totalPrice(){
        double price = 0; 
        for (StockInterface element : this.collection){
            price += element.totalPrice();
           }
        return price;
    }
    
    public String checkout(){
       return null;
 
    }
}