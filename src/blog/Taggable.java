package blog;

import java.util.*;

public interface Taggable {
	
	void addTag(String tag);
	
	void removeTag(String tag);
	
	int tagCount();
	
	List<String> getTags();
}
