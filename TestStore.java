/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;
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

        LinkedList<String> list = new LinkedList<String>();
        //add elements to the list
        for ( String element : list ) {
        System.out.println( element ); // or another operation on elements
        }
        Date date = new Date();
        try { date = new SimpleDateFormat().parse( myString ); } // Date instance
        catch( Exception e ) {}
        long isbn = Long.parseLong( myString ); // convert to long
        double price = Double.parseDouble( myString ); // convert to double
        Currency currency = Currency.getInstance( myString ); // Currency instance
        int copies = Integer.parseInt( myString ); // convert to int
        Book b = new Book(); 
    }
  
}
