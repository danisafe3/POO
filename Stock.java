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
        return this.book.getTitle();
    }
    public int numberOfCopies(){
        return this.copias;
    }
    public void addCopies(int numberOfCopies){
        this.copias = this.copias + numberOfCopies;
    }
    public void removeCopies(int numberOfCopies){
        this.copias = this.copias - numberOfCopies;
    }
    /*
    public double totalPrice(){
        
        double price = Double.parseDouble( myString );
        return price;
    }*/
}
