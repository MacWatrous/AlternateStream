package alternatestream;

/**
 * Created by mac on 5/19/17.
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static String bot_id;
    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
