package alternatestream;

/**
 * Created by mac on 5/19/17.
 */

import alternatestream.apitemplates.Callback;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpointController {

    @RequestMapping("/callback")
    public CallbackReply response(@RequestBody Callback body) throws InterruptedException {
        return new CallbackReply("415f181a03756469db0996fb88",body);
    }
}