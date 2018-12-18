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
public class Stock implements StockInterface{
    private Book book;
    private int copies;
    private double price;
    private Currency c;

    public Stock(Book book, int copias,double price, Currency c) {
        this.book = book;
        this.copies = copias;
        this.price = price;
        this.c = c;
    }
    
    public Book getBook(){
        return this.book;
    }
    
    public String getBookTitle(){
        return this.book.getTitle();
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public Currency getCurrency(){
        return this.c;
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
