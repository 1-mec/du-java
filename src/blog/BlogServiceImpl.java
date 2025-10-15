package blog;

import java.util.ArrayList;
import java.util.List;

public class BlogServiceImpl implements BlogService{

	private String title;
	private List<Publishable> items;
	
	public BlogServiceImpl(String title) {
		super();
		this.title = title;
		this.items = new ArrayList<>();
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void post(Publishable item) {
		if (item != null) items.add(item);
	}
	
	public List<Publishable> getItems(){
		List<Publishable> p = new ArrayList<Publishable>();
		for (int i = 0 ; this.items.size() > i ; i++) {
			if (items != null) {
				p.add(this.items.get(i));
			}
		}
		this.items = p;
		return this.items;
	}
	
	public int getPublishableItemsCount() {
		int cnt = 0;
		for (int i = 0 ; this.items.size() > i ; i++) {
			Publishable p = this.items.get(i);
			if ((this.items.get(i) != null) && (p instanceof Publishable) ){
				cnt++;
			}
		}
		return cnt;
	}
	
	public int getTaggableItemsCount() {
		int cnt = 0;
		for (int i = 0 ; this.items.size() > i ; i++) {
			Publishable p = this.items.get(i);
			if ((this.items.get(i) != null) && (p instanceof Taggable) ){
				cnt++;
			}
		}
		return cnt;
	}
	
	public List<Publishable> findItemsByAuthor(String author) {
		List<Publishable> p = new ArrayList<Publishable>();
		for (int i = 0; i < this.items.size(); i ++) {
			if (((Publishable) this.items).getAuthor() == author) {
				p.add(i, this.items.get(i));
			}
		}
		this.items = p;
		return this.items;
	}
	
	public Publishable getLatestItem() {
		Publishable a = ((Publishable)this.items.get(0));
		for (int i = 1 ; i < this.items.size();i++) {
			if (((Publishable) this.items.get(i)).getPublicationDate() >((Publishable) this.items.get(i-1)).getPublicationDate()) {
				a = this.items.get(i);
			}
		}
		return a ;
	}

	
	public List<Publishable> findItemsByTags(String[] tags) {
		List<Publishable> p = new ArrayList<Publishable>();
		for (int i = 0; i < this.items.size(); i ++) {
			if (tags[i].equals(p.get(i))) {
				p.add(i, this.items.get(i));
			}
		}
		this.items = p;
		return this.items;
	}
	
	public List<Publishable> findItemsByContent(String[] words) {
		return null;
	}
		
	public List<Publishable> findItemsByTagsOrContent(String[] tags) {
		List<Publishable> p = new ArrayList<Publishable>();
		for (int i = 0; i < this.items.size(); i ++) {
			if (tags[i].equals(p.get(i))) {
				p.add(i, this.items.get(i));
			}
		}
		return p ;
	}
	
}
