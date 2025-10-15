package blog;

import java.util.*;

public interface BlogService {
	
	    String getTitle();

	    void post(Publishable item);

	    List<Publishable> getItems();

	    int getPublishableItemsCount();

	    int getTaggableItemsCount();

	    List<Publishable> findItemsByAuthor(String author);

	    Publishable getLatestItem();

	    List<Publishable> findItemsByTags(String[] tags);

	    List<Publishable> findItemsByContent(String[] words);

	    List<Publishable> findItemsByTagsOrContent(String[] tags);
	

}
