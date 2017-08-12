package alternatestream.apitemplates;

import java.util.List;

/**
 * Created by mac on 5/19/17.
 */
public class Track {
    private Album album;
    private List<Artist> artists;
    private String[] available_markets;
    private int disc_number;
    private int duration_ms;
    private boolean explicit;
    private Object external_ids;
    private Object external_urls;
    private String href;
    private String id;
    private boolean is_playable;
    private Object linked_from;
    private String name;
    private int popularity;
    private String preview_url;
    private int track_number;
    private String type;
    private String uri;

    public Track(){}

    public Track(Album album, List<Artist> artists, String[] available_markets, int disc_number, int duration_ms, boolean explicit, Object external_ids, Object external_urls, String href, String id, boolean is_playable, Object linked_from, String name, int popularity, String preview_url, int track_number, String type, String uri) {
        this.album = album;
        this.artists = artists;
        this.available_markets = available_markets;
        this.disc_number = disc_number;
        this.duration_ms = duration_ms;
        this.explicit = explicit;
        this.external_ids = external_ids;
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.is_playable = is_playable;
        this.linked_from = linked_from;
        this.name = name;
        this.popularity = popularity;
        this.preview_url = preview_url;
        this.track_number = track_number;
        this.type = type;
        this.uri = uri;
    }

    public Album getAlbum() {
        return album;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public String[] getAvailable_markets() {
        return available_markets;
    }

    public int getDisc_number() {
        return disc_number;
    }

    public int getDuration_ms() {
        return duration_ms;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public Object getExternal_ids() {
        return external_ids;
    }

    public Object getExternal_urls() {
        return external_urls;
    }

    public String getHref() {
        return href;
    }

    public String getId() {
        return id;
    }

    public boolean is_playable() {
        return is_playable;
    }

    public Object getLinked_from() {
        return linked_from;
    }

    public String getName() {
        return name;
    }

    public int getPopularity() {
        return popularity;
    }

    public String getPreview_url() {
        return preview_url;
    }

    public int getTrack_number() {
        return track_number;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }
}
