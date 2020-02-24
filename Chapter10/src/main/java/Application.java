import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jiangsuyao on 2020/2/22.
 */

@SpringBootApplication
@ComponentScan("com.jessy")

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);




    }


}
