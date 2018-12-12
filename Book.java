/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
import java.util.Date;
/**
 *
 * @author gopbc
 */
public class Book {
    private final String title;
    private final String author;
    private final Date publicationDate;
    private final String publicationPlace;
    private final double ISBN;

    public Book(String title, String author, Date publicationDate, String publicationPlace, double ISBN) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.publicationPlace = publicationPlace;
        this.ISBN = ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public Date getPublicationDate(){
        return this.publicationDate;
    }
    public String getPublicationPlace(){
        return this.publicationPlace;
    }

    public double getISBN() {
        return this.ISBN;
    }
 
}
