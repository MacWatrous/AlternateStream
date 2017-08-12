package alternatestream;

/**
 * Created by mac on 5/19/17.
 */
import alternatestream.apitemplates.Callback;
import alternatestream.apitemplates.iTunesSearch;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

public class CallbackReply {
    //bot_id
    //text

    final String bot_id;

    String text;

    public CallbackReply(String bot_id, Callback body) throws InterruptedException {
        this.bot_id = bot_id;
        //Logic here to parse text and find urls
        String[] spotURLParsed = MsgParser.parse(body.getText());
        if (spotURLParsed == null){
            return;
        }
        AlternateDiscovery discover = new AlternateDiscovery(spotURLParsed);
        String iTunesUrl = discover.findAlternate();
        text = iTunesUrl;
        RestTemplate rt = new RestTemplate();

        rt.setErrorHandler(new DefaultResponseErrorHandler(){
            protected boolean hasError(HttpStatus statusCode) {
                return false;
            }});
        rt.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        rt.getMessageConverters().add(new StringHttpMessageConverter());
        rt.postForObject("https://api.groupme.com/v3/bots/post",this,String.class);
    }

    public String getBot_id(){
        return bot_id;
    }
    public String getText(){
        return text;
    }
}
