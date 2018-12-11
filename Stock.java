/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import java.util.Currency;
/**
 *
 * @author gopbc
 */
public class Stock {
    private Book book;
    private int copias;
    private Currency c;

    public Stock(Book book, int copias, Currency c) {
        this.book = book;
        this.copias = copias;
        this.c = c;
    }
    
    public Book getBook(){
            return this.book;
    }
    public String getBookTiltle(){
        
    }
    public int numberOfCopies(){
        
    }
    public void addCopies(int numberOfCopies){
        
    }
    public void removeCopies(int numberOfCopies){
        
    }
    public double totalPrice(){
        
    }
}
