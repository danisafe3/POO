package bookstore;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author gopbc
 */
public class TestStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Catalog c = new Catalog();
        ShoppingCart s = new ShoppingCart(c);
        BookStore bs = new BookStore(c, s);
        
    }

}
