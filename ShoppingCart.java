/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import java.util.HashSet;
import java.util.Currency;
import org.w3c.dom.Element;
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

    
    public double totalPrice(){
        double price = 0; 
//Suponemos que todos los precios son de la misma divisa ya que no existe un 
//metodo para cambiar de divisa
        for (Stock element : this.collection){
            price += element.totalPrice();
           }
        return price;
    }
    
    public String checkout(){
       return null;
 
    }
}
