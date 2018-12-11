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
    private String title;
    private String author;
    private Date publicationDate;
    private String publicationPlace;
    private int IBN;

    public Book(String title, String author, Date publicationDate, String publicationPlace, int IBN) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.publicationPlace = publicationPlace;
        this.IBN = IBN;
    }
    public String getTitle(){
        
    }
    public String getAuthor(){
        
    }
    public Date getPublicationDate(){
        
    }
    public String getPublicationPlace(){
        
    }
    public int getISBN(){
        
    }
}
