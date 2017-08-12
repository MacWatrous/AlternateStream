package alternatestream;

/**
 * Created by mac on 5/19/17.
 */
public class MsgParser {

    public static String[] parse(String text){
        if (text.contains("https://")){
            //we have a link
            String[] items = text.split(" ");
            for (String word : items){
                if (word.contains("open.spotify")){
                    String[] urlParts = word.split("/");
                    return urlParts;
                }
            }

        }
        //return some pair with a value representing spotify, apple music, soundcloud or youtube?
        return null;
    }
}
