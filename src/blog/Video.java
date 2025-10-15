package blog;

public class Video extends AbstractItem {
	private String url;
	
	public Video(long publicationDate, String author,String url) {
		super(publicationDate, author);
		publicationDate = this.getPublicationDate();
		author = this.getAuthor() ;
		this.url = url;
	}

	public String getURL() {
		return url;
	}
}
	
