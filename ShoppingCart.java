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
    private Currency currency;

    public ShoppingCart(Catalog catinit) {
        this.catalog = catinit;
        
        for (StockInterface element : this.catalog.collection){
            if (element instanceof Stock){
                Stock stock = (Stock) element;
                Stock newStock = new Stock(stock.getBook(), 
                    0, stock.getPrice(), stock.getCurrency());
                this.collection.add(newStock);
                this.currency = stock.getCurrency();
            }
        }
    }
    
    @Override
    public void addCopies(int numberOfCopies, String booktitle) {
        super.getStock(booktitle).addCopies(numberOfCopies);
        this.catalog.removeCopies(numberOfCopies, booktitle);
    }

    @Override
    public void removeCopies(int numberOfCopies, String booktitle) {
        super.getStock(booktitle).removeCopies(numberOfCopies);
        this.catalog.addCopies(numberOfCopies, booktitle);
    }
    
    
    @Override
    public double totalPrice(){
        double price = 0; 
        for (StockInterface element : this.collection){
            if (element instanceof Stock){
                Stock stock = (Stock) element;
                price += stock.totalPrice();
            }
        }
        return price;
    }
    
    @Override
    public String checkout(){
        Payment p = new Payment();
        String s = p.doPayment(1234567890, "The Hedgehog, Sonic", totalPrice(), this.currency);
        
        for (StockInterface element : this.collection ){
            if (element instanceof Stock){
                Stock stock = (Stock) element;
                stock.removeCopies(numberOfCopies(stock.getBookTitle()));
            }
        }
        
        return(s);
    }
}