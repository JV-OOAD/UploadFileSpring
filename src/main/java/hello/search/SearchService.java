package hello.search;

import java.util.Hashtable;
import java.util.List;

import com.google.api.services.drive.model.*;

public interface SearchService {
	List<FileDrive> doSearch(String name);
}
