/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import java.util.HashSet;
import java.util.Currency;
/**
 *
 * @author gopbc
 */
public class ShoppingCart extends BookCollection{
    private Catalog catalog;

    public ShoppingCart(Catalog catinit) {
        this.catalog = catinit;
    }
   
        
    public void pay(int visa, String name, double price, Currency c){
        
    }
    /*
    public double totalPrice(){
        double price = Double.parseDouble( myString );
        return price;
    }
    
    public String checkout(){
        ShoppingCart compra = new ShoppingCart();
        
 
        
    }*/
}
