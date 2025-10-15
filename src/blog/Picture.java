package blog;

public class Picture extends AbstractItem {
	private String URL;
	
	public Picture(long publicationDate, String author,String URL) {
		super(publicationDate, author);
		publicationDate = this.getPublicationDate();
		author = this.getAuthor() ;
		this.URL = URL;
	}

	public String getURL() {
		return URL;
	}
	
}