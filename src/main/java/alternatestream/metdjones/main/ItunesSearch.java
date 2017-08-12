package alternatestream.metdjones.main;

import alternatestream.metdjones.main.parameter.Entity;
import alternatestream.metdjones.main.parameter.Parameter;
import alternatestream.metdjones.main.parameter.SearchTerm;
import alternatestream.metdjones.main.result.SearchResult;
import alternatestream.metdjones.main.result.SearchResultList;
import alternatestream.metdjones.main.utils.JSONUtil;
import alternatestream.metdjones.main.utils.URLUtil;
import alternatestream.metdjones.main.parameter.Attribute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ItunesSearch {
    private static final String searchURL = "https://itunes.apple.com/search?";
    private SearchTerm searchTerm;
    private SearchResultList searchResults;
    private List<Parameter> parameters;

    public ItunesSearch(){
        parameters = new ArrayList<Parameter>();
    }

    public List<SearchResult> search(){
        URL searchURL = URLUtil.buildSearchURL(appendSearchParameters());
        HttpURLConnection connection = URLUtil.openConnection(searchURL);
        try {
            String jsonString = convertStreamToString(connection.getInputStream());
            searchResults = JSONUtil.parseJSON(jsonString);
        }catch (IOException e){
            e.printStackTrace();
            searchResults = null;
        }
        return searchResults;
    }

    public void addParameter(Parameter parameter){
        parameters.add(parameter);
    }

    public void addAttribute(Attribute attribute){
        parameters.add(attribute);
    }

    public void addEntity(Entity entity){
        parameters.add(entity);
    }

    public void setSearchTerm(String searchTerm){
        this.searchTerm = new SearchTerm (searchTerm);
    }

    public String getSearchTerm(){
        return searchTerm.getSearchTerm();
    }

    /**
     *
     * @return
     */
    private String appendSearchParameters(){
        String parameterString = new String();
        parameterString += searchURL + searchTerm.createParameter();

        StringJoiner joiner = new StringJoiner("&");
        joiner.add(parameterString);

        for (Parameter parameter: parameters){
            joiner.add(parameter.createParameter());
        }

        parameterString = joiner.toString();
        return parameterString;
    }

    private static String convertStreamToString(InputStream is){
        String line;
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            while ((line = br.readLine()) != null){
                sb.append(line + "\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
