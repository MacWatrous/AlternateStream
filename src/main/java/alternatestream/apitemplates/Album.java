package alternatestream.apitemplates;

import java.util.List;

/**
 * Created by mac on 5/19/17.
 */
public class Album {
    private String album_type;
    private List<Artist> artists;
    private List<String> available_markets;
    private List<Object> copyrights;
    private Object external_ids;
    private Object external_urls;
    private List<String> genres;
    private String href;
    private String id;
    private List<Object> images;
    private String label;
    private String name;
    private int popularity;
    private String release_date;
    private String release_date_precision;
    private Object tracks;
    private String type;
    private String uri;

    public Album(){}

    public Album(String album_type, List<Artist> artists, List<String> available_markets, List<Object> copyrights, Object external_ids, Object external_urls, List<String> genres, String href, String id, List<Object> images, String label, String name, int popularity, String release_date, String release_date_precision, Object tracks, String type, String uri) {
        this.album_type = album_type;
        this.artists = artists;
        this.available_markets = available_markets;
        this.copyrights = copyrights;
        this.external_ids = external_ids;
        this.external_urls = external_urls;
        this.genres = genres;
        this.href = href;
        this.id = id;
        this.images = images;
        this.label = label;
        this.name = name;
        this.popularity = popularity;
        this.release_date = release_date;
        this.release_date_precision = release_date_precision;
        this.tracks = tracks;
        this.type = type;
        this.uri = uri;
    }


    public String getAlbum_type() {
        return album_type;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public List<String> getAvailable_markets() {
        return available_markets;
    }

    public List<Object> getCopyrights() {
        return copyrights;
    }

    public Object getExternal_ids() {
        return external_ids;
    }

    public Object getExternal_urls() {
        return external_urls;
    }

    public List<String> getGenres() {
        return genres;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public List<Object> getImages() {
        return images;
    }

    public String getLabel() {
        return label;
    }

    public String getName() {
        return name;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getRelease_date() {
        return release_date;
    }

    public String getRelease_date_precision() {
        return release_date_precision;
    }

    public Object getTracks() {
        return tracks;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

}