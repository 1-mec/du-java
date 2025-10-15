package blog;

import java.util.*;

public abstract class AbstractItem extends AbstractPublishableItem implements Taggable,Publishable {
	private List<String> tags = new ArrayList<String>();

	public AbstractItem(long publicationDate, String author) {
		super(publicationDate, author);
		publicationDate = this.getPublicationDate();
		author = this.getAuthor() ;
	}

	public void addTag(String tag) {
		if (this.tags == null) {
			System.out.println("liste null");
		} else if (tag == null) {
			return ;
		} else {
			for (int i = 0; i < this.tags.size() ; i++) {
				if (this.tags.get(i) == tag) {
					return ;
				}
			}
			this.tags.add(tag);
		}
		
	}
	public void removeTag(String tag) {
		String[] temp = new String[this.tags.size()];
		List<String> l = new ArrayList<String>();
		if(tag ==null) {
			return ;
		} else if (this.tags == null) {
			return ;
		} else {
			for (int i = 0; i < this.tags.size() ; i++) {
				if (this.tags.get(i) != tag) {
					temp[i] = this.tags.get(i);
					l.add(temp[i]);
				}
			}
			this.tags = l;
		}
	}
	public int tagCount() {
		int cnt = 0;
		if(this.tags ==null) {
			return 0 ;
		} else {
			for (int i = 0; i < this.tags.size() ; i++) {
				cnt+=1;
			}
			
		}
		return cnt;
	}
	
	public List<String> getTags() {
		List<String> tagss = new ArrayList<String>();	
		if(this.tags ==null) {
			tagss.add("");
		} else {
			for (int i = 0; i < this.tags.size() ; i++) {
				tagss.add(i,this.tags.get(i));
			}
		}
		return tagss;
	}
	
}
