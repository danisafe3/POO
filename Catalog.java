/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedList;

/**
 *
 * @author gopbc
 */
public class Catalog extends BookCollection {

    public Catalog() {
        super();//construyo padre
        LinkedList< String[]> lista = Catalog.readCatalog("books.xml"); //leo el xml

        //recorro la lista de "libros" para parsear los datos
        for (String[] element : lista) {

            Date date = new Date();
            try {
                date = new SimpleDateFormat().parse(element[0]);
            } // Date instance
            catch (Exception e) {

            }
            long isbn = Long.parseLong(element[4]); // convert to long 

            //creo el libro
            Book b = new Book(element[0], element[1], date, element[3], isbn);

            double price = Double.parseDouble(element[5]); // convert to double
            Currency currency = Currency.getInstance(element[6]); // Currency instance
            int copies = Integer.parseInt(element[7]); // convert to int

            //creo el stock con el libro
            Stock st = new Stock(b, copies, price, currency);

            //lo añado a la colección de catalago
            this.collection.add(st);

        }
    }
}
