package alternatestream;

import alternatestream.apitemplates.Album;
import alternatestream.apitemplates.Track;
import alternatestream.apitemplates.iTunesSearch;
import alternatestream.metdjones.main.parameter.Entity;
import alternatestream.metdjones.main.result.SearchResult;
import alternatestream.metdjones.main.result.wrapper.Collection;
import alternatestream.metdjones.main.result.wrapper.TrackReturn;
import org.springframework.http.MediaType;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedList;
import java.util.List;
import alternatestream.metdjones.main.ItunesSearch;


/**
 * Created by mac on 5/19/17.
 */
public class AlternateDiscovery {

    String newUrl;
    String[] spotURLParsed;
    String spotId;
    boolean alOrTrack;

    public AlternateDiscovery(String[] spotURLParsed){
        this.spotURLParsed = spotURLParsed;
    }

    public String findAlternate() throws InterruptedException {
        spotId = spotURLParsed[spotURLParsed.length-1];
        if (spotURLParsed[spotURLParsed.length-2].equals("album")){
            alOrTrack = true;
        }
        else {
            alOrTrack = false;
        }
        RestTemplate rt = new RestTemplate();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        List<MediaType> supportedMediaTypes = new LinkedList<MediaType>(converter.getSupportedMediaTypes());
        MediaType textJavascriptMediaType = new MediaType("text", "javascript", MappingJackson2HttpMessageConverter.DEFAULT_CHARSET);
        supportedMediaTypes.add(textJavascriptMediaType);
        converter.setSupportedMediaTypes(supportedMediaTypes);
        rt.getMessageConverters().add(converter);
        rt.getMessageConverters().add(new StringHttpMessageConverter());
        String uri = "";
        Album retAlbum = null;
        Track retTrack = null;
        if (alOrTrack){
            uri = "https://api.spotify.com/v1/albums/" + spotId;
            retAlbum = rt.getForObject(uri,Album.class);
        }
        else {
            uri = "https://api.spotify.com/v1/tracks/" + spotId;
            retTrack = rt.getForObject(uri,Track.class);
        }

        if (alOrTrack){
            //RestTemplate rt = new RestTemplate();
            //rt.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            //rt.getMessageConverters().add(new StringHttpMessageConverter());
            String artistName = retAlbum.getArtists().get(0).getName();
            String[] names = artistName.split(" ");
            String artistFormattedNameAndAlbum = "";
            String albumName = retAlbum.getName();
            String[] albumNames = albumName.split(" ");
            for (int i = 0; i < names.length; i++) {
                artistFormattedNameAndAlbum += names[i]+"+";
            }
            for (int i = 0; i < albumNames.length; i++) {
                artistFormattedNameAndAlbum += albumNames[i];
                if (i <= albumNames.length-2){
                    artistFormattedNameAndAlbum += "+";
                }
            }
            ItunesSearch itunesSearch = new ItunesSearch();
            itunesSearch.setSearchTerm(artistFormattedNameAndAlbum);
            itunesSearch.addEntity(Entity.Music.ALBUM);
            List<SearchResult> searchResults = itunesSearch.search();
            //Thread.sleep(2000);
            //searchResults.get(0).getViewURL();
            //String uriiTunes = "https://itunes.apple.com/search?term="+artistFormattedNameAndAlbum+"&entity=album";

            //iTunesSearch search = rt.getForObject(uriiTunes,iTunesSearch.class);
            if (searchResults.size() == 0){
                return ""; //temp, change to empty string
            }
            for (int x = 0; x < searchResults.size();x++){
                if (((Collection)searchResults.get(x)).getExplicit()){
                    return ((Collection)searchResults.get(x)).collectionViewURL.toString();
                }
            }
            return ((Collection)searchResults.get(0)).collectionViewURL.toString();
        }
        else {
            //rt.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            //rt.getMessageConverters().add(new StringHttpMessageConverter());
            String artistName = retTrack.getArtists().get(0).getName();
            String[] names = artistName.split(" ");
            String artistFormattedNameAndAlbum = "";
            String albumName = retTrack.getName();
            String[] albumNames = albumName.split(" ");

            for (String name : names) {
                artistFormattedNameAndAlbum += name+"+";
            }
            for (int x=0; x < albumNames.length;x++){
                artistFormattedNameAndAlbum += albumNames[x];
                if (x != albumNames.length-2){
                    artistFormattedNameAndAlbum += "+";
                }
            }
            ItunesSearch itunesSearch = new ItunesSearch();
            itunesSearch.setSearchTerm(artistFormattedNameAndAlbum);
            itunesSearch.addEntity(Entity.Music.TRACK);
            List<SearchResult> searchResults = itunesSearch.search();

            //String uriiTunes = "https://itunes.apple.com/search?term="+artistFormattedNameAndAlbum+"&entity=musicTrack";
            //iTunesSearch search = rt.getForObject(uriiTunes,iTunesSearch.class);
            if (searchResults.size() == 0){
                return ""; //temp, change to empty string
            }
            for (int x = 0; x < searchResults.size();x++){
                if (((TrackReturn)searchResults.get(x)).getExplicit()){
                    return ((TrackReturn)searchResults.get(x)).collectionViewURL.toString();
                }
            }
            return ((TrackReturn)searchResults.get(0)).collectionViewURL.toString();
        }
    }
}
