
package bookstore;

public interface BookCollectionInterface {
	public String[] booktitles();
	public int numberOfCopies( String booktitle );
	public void addCopies( int numberOfCopies, String booktitle );
	public void removeCopies( int numberOfCopies, String booktitle );
}
