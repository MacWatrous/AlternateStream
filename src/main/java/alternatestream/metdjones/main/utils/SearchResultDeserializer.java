package alternatestream.metdjones.main.utils;

import alternatestream.metdjones.main.result.wrapper.Collection;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import alternatestream.metdjones.main.result.SearchResult;
import alternatestream.metdjones.main.result.wrapper.Artist;
import alternatestream.metdjones.main.result.wrapper.TrackReturn;

import java.lang.reflect.Type;

public class SearchResultDeserializer implements JsonDeserializer<SearchResult>{
    @Override
    public SearchResult deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if(jsonElement == null){
            return null;
        }else {
            String wrapperType = jsonElement.getAsJsonObject().get("wrapperType").getAsString();
            switch (wrapperType){
                case "track":
                    return jsonDeserializationContext.deserialize(jsonElement, TrackReturn.class);
                case "artist":
                    return jsonDeserializationContext.deserialize(jsonElement, Artist.class);
                case "collection":
                    return jsonDeserializationContext.deserialize(jsonElement, Collection.class);
                default:
                    return null;
            }
        }
    }
}
