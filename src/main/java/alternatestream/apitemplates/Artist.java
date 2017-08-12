package alternatestream.apitemplates;

/**
 * Created by mac on 5/19/17.
 */
public class Artist {
    private Object external_urls;
    private String href;
    private String id;
    private String name;
    private String type;
    private String uri;

    public Artist(){}

    public Artist(Object external_urls, String href, String id, String name, String type, String uri) {
        this.external_urls = external_urls;
        this.href = href;
        this.id = id;
        this.name = name;
        this.type = type;
        this.uri = uri;
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

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getUri() {
        return uri;
    }

}
