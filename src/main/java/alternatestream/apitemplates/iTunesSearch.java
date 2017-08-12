package alternatestream.apitemplates;

import java.util.List;

/**
 * Created by mac on 5/20/17.
 */
public class iTunesSearch {
    private int resultCount;
    private List<iTunesResult> results;

    public iTunesSearch(){}

    public iTunesSearch(int resultCount, List<iTunesResult> results) {
        this.resultCount = resultCount;
        this.results = results;
    }

    public int getResultCount() {
        return resultCount;
    }

    public List<iTunesResult> getResults() {
        return results;
    }
}
