package alternatestream.metdjones.main.result.wrapper;

import alternatestream.metdjones.main.result.Kind;
import alternatestream.metdjones.main.result.SearchResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.net.URL;

public class Artist extends SearchResult {
    @Expose private String artistName;
    @Expose private int amgArtistId;
    @Expose private int primaryGenreId;
    @SerializedName("artistLinkUrl")
    private URL artistLinkUrl;

    Artist(String artistName){
        this.artistName = artistName;
    }

    @Override
    public String getTitle(){
        return artistName;
    }

    public void setKind(Kind kind){
        this.kind = kind;
    }
}
