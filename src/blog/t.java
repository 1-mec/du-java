package blog;
import java.util.*;

public class t extends AbstractPublishableItem implements Taggable,Publishable{
		private List<String> tags;
		public t(long publicationDate, String author) {
			super(publicationDate, author);
			publicationDate = this.getPublicationDate();
			author = this.getAuthor() ;
		}
		public List<String> getTags() {
			return tags;
		}
		public void setTags(List<String> tags) {
			this.tags = tags;
		}
	public static void main(String[] args) {
		t p = new t(54545, "oui");
		List<String> m = new ArrayList<String> ();
		m.add("wswgr");
		m.add("wswgzffzr");
		p.setTags(m);
		System.out.println(p.getTags());
		

	}

}
