package blog;

public interface Publishable {
	
	public default long getPublicationDate() {
		return this.getPublicationDate();
	}
	
	public default String getAuthor() {
		return this.getAuthor();
	}
}
