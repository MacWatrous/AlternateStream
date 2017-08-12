package alternatestream.metdjones.main.utils;

import alternatestream.metdjones.main.result.SearchResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import alternatestream.metdjones.main.result.JSONResult;
import alternatestream.metdjones.main.result.SearchResultList;

import java.util.ArrayList;

public class JSONUtil {
    public static SearchResultList parseJSON(String string){
        Gson gson = new GsonBuilder().registerTypeAdapter(SearchResult.class, new SearchResultDeserializer()).create();
        ArrayList<SearchResult> searchResults = gson.fromJson(string, JSONResult.class).getSearchResults();

        SearchResultList searchResultList = new SearchResultList(searchResults);
        return searchResultList;
    }
}
