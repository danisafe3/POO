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
    private int copies;
    private double price;
    private Currency c;

    public Stock(Book book, int copias, Currency c) {
        this.book = book;
        this.copies = copias;
        this.c = c;
    }
    
    public Book getBook(){
        return this.book;
    }
    public String getBookTiltle(){
        return this.book.getTitle();
    }
    public int numberOfCopies(){
        return this.copies;
    }
    public void addCopies(int numberOfCopies){
        this.copies = this.copies + numberOfCopies;
    }
    public void removeCopies(int numberOfCopies){
        this.copies = this.copies - numberOfCopies;
    }
    
    public double totalPrice(){
        double price = this.price * this.copies;
        return price;
    }
}
