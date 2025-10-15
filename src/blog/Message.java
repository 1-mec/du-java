package blog;

public class Message extends AbstractPublishableItem {
	private String content ;
	
	public Message(long publicationDate, String author , String content) {
		super(publicationDate, author);
		publicationDate = this.getPublicationDate();
		author = this.getAuthor() ;
		this.content = content;
	
	}
	
	public String getContent() {
		return this.content;
	}
}
