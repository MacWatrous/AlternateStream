package alternatestream.apitemplates;

/**
 * Created by mac on 5/20/17.
 */
public class iTunesResult {
    private String wrapperType;
    private String kind;
    private int artistId;
    private int collectionId;
    private int trackId;
    private String artistName;
    private String collectionName;
    private String trackName;
    private String collectionCensoredName;
    private String trackCensoredName;
    private String artistViewUrl;
    private String collectionViewUrl;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl60;
    private String artworkUrl100;
    private int collectionprice;
    private int trackPrice;
    private String collectionExplicitness;
    private String trackExplicitness;
    private int discCount;
    private int discNumber;
    private int trackCount;
    private int trackNumber;
    private int trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;

    public iTunesResult(){}

    public iTunesResult(String wrapperType, String kind, int artistId, int collectionId, int trackId, String artistName, String collectionName, String trackName, String collectionCensoredName, String trackCensoredName, String artistViewUrl, String collectionViewUrl,String trackViewUrl, String previewUrl, String artworkUrl60, String artworkUrl100, int collectionprice, int trackPrice, String collectionExplicitness, String trackExplicitness, int discCount, int discNumber, int trackCount, int trackNumber, int trackTimeMillis, String country, String currency, String primaryGenreName) {
        this.wrapperType = wrapperType;
        this.kind = kind;
        this.artistId = artistId;
        this.collectionId = collectionId;
        this.trackId = trackId;
        this.artistName = artistName;
        this.collectionName = collectionName;
        this.trackName = trackName;
        this.collectionCensoredName = collectionCensoredName;
        this.trackCensoredName = trackCensoredName;
        this.artistViewUrl = artistViewUrl;
        this.collectionViewUrl = collectionViewUrl;
        this.trackViewUrl = trackViewUrl;
        this.previewUrl = previewUrl;
        this.artworkUrl60 = artworkUrl60;
        this.artworkUrl100 = artworkUrl100;
        this.collectionprice = collectionprice;
        this.trackPrice = trackPrice;
        this.collectionExplicitness = collectionExplicitness;
        this.trackExplicitness = trackExplicitness;
        this.discCount = discCount;
        this.discNumber = discNumber;
        this.trackCount = trackCount;
        this.trackNumber = trackNumber;
        this.trackTimeMillis = trackTimeMillis;
        this.country = country;
        this.currency = currency;
        this.primaryGenreName = primaryGenreName;
    }

    public String getWrapperType() {
        return wrapperType;
    }

    public String getKind() {
        return kind;
    }

    public int getArtistId() {
        return artistId;
    }

    public int getCollectionId() {
        return collectionId;
    }

    public int getTrackId() {
        return trackId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public String getTrackName() {
        return trackName;
    }

    public String getCollectionCensoredName() {
        return collectionCensoredName;
    }

    public String getTrackCensoredName() {
        return trackCensoredName;
    }

    public String getArtistViewUrl() {
        return artistViewUrl;
    }

    public String getTrackViewUrl() {
        return trackViewUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public int getCollectionprice() {
        return collectionprice;
    }

    public int getTrackPrice() {
        return trackPrice;
    }

    public String getCollectionExplicitness() {
        return collectionExplicitness;
    }

    public String getTrackExplicitness() {
        return trackExplicitness;
    }

    public int getDiscCount() {
        return discCount;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public int getTrackCount() {
        return trackCount;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public int getTrackTimeMillis() {
        return trackTimeMillis;
    }

    public String getCountry() {
        return country;
    }

    public String getCurrency() {
        return currency;
    }

    public String getPrimaryGenreName() {
        return primaryGenreName;
    }

    public String getCollectionViewUrl() {
        return collectionViewUrl;
    }



}
