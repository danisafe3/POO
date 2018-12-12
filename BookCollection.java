
package bookstore;

import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public abstract class BookCollection implements BookCollectionInterface {
	protected HashSet< Stock > collection;

	public BookCollection() {
		collection = new HashSet< Stock >();
	}

	public String[] booktitles() {
		int index = 0;
		String[] result = new String[collection.size()];
		for ( Stock stock : collection ) {
			result[index] = stock.getBookTitle();
			index++;
		}
		return result;
	}

	private Stock getStock( String booktitle ) {
		for ( Stock stock : collection ) {
			if ( booktitle.equals( stock.getBookTitle() ) )
				return stock;
		}
		return null;
	}

    public int numberOfCopies(String booktitle) { //le pasamos el titulo del libro y cogemos el stock del libro, luego llamamos al metodo numberOfCopies() para obtener su nºde copias
        Stock stock = getStock(booktitle);
        return stock.numberOfCopies();
    }

    public void addCopies(int numberOfCopies, String booktitle) {
        Stock stock = getStock(booktitle);
        stock.addCopies(numberOfCopies);
    }

    public void removeCopies(int numberOfCopies, String booktitle) {
        Stock stock = getStock(booktitle);
        stock.removeCopies(numberOfCopies);
    }

    public static LinkedList< String[]> readCatalog(String filename) {
        LinkedList< String[]> books = new LinkedList< String[]>();
        String[] tokens = {"title", "author", "date", "place",
            "isbn", "price", "currency", "copies"};
        try {
            File input = new File(filename);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(input);
            doc.getDocumentElement().normalize();
            NodeList list = doc.getElementsByTagName("book");
            for (int i = 0; i < list.getLength(); ++i) {
                Element element = (Element) list.item(i);
                String[] book = new String[tokens.length];
                for (int j = 0; j < tokens.length; ++j) {
                    NodeList nl = element.getElementsByTagName(tokens[j]);
                    Node node = nl.item(0).getChildNodes().item(0);
                    book[j] = node.getNodeValue();
                }
                books.add(book);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return books;
    }
}
