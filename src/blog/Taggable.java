package blog;

import java.util.*;

public interface Taggable {
	
	public default void addTag(String tag) {
		this.addTag(tag);
	}
	
	public default void removeTag(String tag) {
		this.removeTag(tag);
	}
	
	public default int tagCount() {
		return this.tagCount();
	}
	
	public default List<String> getTags() {
		return this.getTags();
	}
}
