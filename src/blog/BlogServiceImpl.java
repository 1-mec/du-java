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
		if (author != null) {
			for (int i = 0; i < this.items.size(); i ++) {
				if (( this.items.get(i)).getAuthor().equals(author) ) {
					p.add(this.items.get(i));
				}
			}
		}
		return p;
	}
	
	public Publishable getLatestItem() {
	    if (items.isEmpty()) {
	        return null;
	    }

	    Publishable latest = items.get(0);
	    for (int i = 1; i < this.items.size(); i++) {
	        if (this.items.get(i).getPublicationDate() > latest.getPublicationDate()) {
	            latest = items.get(i);
	        }
	    }
	    return latest;
	}



	
	public List<Publishable> findItemsByTags(String[] tags) {
	    List<Publishable> result = new ArrayList<>();
	    if (tags == null || tags.length == 0) return result;

	    for (int i = 0 ; i < this.items.size() ; i++) {
	        if (this.items.get(i) instanceof Taggable) {
	            List<String> Tags = ((Taggable) this.items.get(i)).getTags();
	            int y = 0;
	            boolean tout = true;

	            while (y < tags.length && tout) {
	                if (!Tags.contains(tags[y])) {
	                	tout = false; 
	                }
	                y++;
	            }

	            if (tout) result.add(this.items.get(i));
	        }
	    }

	    return result;
	}

	
	public List<Publishable> findItemsByContent(String[] words) {
	    List<Publishable> result = new ArrayList<>();
	    if (words == null || words.length == 0) return result;

	    for (int i = 0 ; i < this.items.size() ; i++) {
	        if (this.items.get(i) instanceof Message) {
	            String msg = (((Message) this.items.get(i)).getContent());
	            int y = 0;
	            boolean tout = true;

	            while (y < words.length && tout) {
	                if (msg.indexOf(words[y]) == -1) {
	                	tout = false; 
	                }
	                y++;
	            }

	            if (tout) result.add(this.items.get(i));
	        }
	    }

	    return result;
	}
		
	public List<Publishable> findItemsByTagsOrContent(String[] tags) {
	    List<Publishable> result = new ArrayList<>();
	    
	    List<Publishable> tag = findItemsByTags(tags);
	    for (int i = 0; i < tag.size(); i++) {
	        result.add(tag.get(i));
	    }
	    
	    List<Publishable> cont = findItemsByContent(tags);
	    for (int i = 0; i < cont.size(); i++) {
	        result.add(cont.get(i));
	    }
	    
	    return result;
	}

	
}

