/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        LinkedList<String []> list = new LinkedList<>();
        //add elements to the list
        for (String[] element : list) {
            String title = element[0];
            String author = element[1];
            Date date = new Date();
            try {
                date = new SimpleDateFormat().parse(element[2]);
            } // Date instance
            catch (Exception e) {
            }
            String place = element[3];
            double isbn = Double.parseDouble(element[4]); // convert to long
            double price = Double.parseDouble(element[5]); // convert to double
            Currency currency = Currency.getInstance(element[6]); // Currency instance
            int copies = Integer.parseInt(element[7]); // convert to int
            Book b = new Book(title, author, date, place, isbn);
            //crear instancia de stock
            Stock s = new Stock(b, copies, price, currency);
            
            System.out.println(b.getTitle()+" "+b.getAuthor()+" "+b.getPublicationDate().toString()+" "+b.getPublicationPlace()+" "+b.getISBN());
        }

    }

}
