import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jack.wang on 2017/6/20.
 */

@ComponentScan("text.spring")
@SpringBootApplication
public class ApplicationAPP {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationAPP.class, args);
    }
}
