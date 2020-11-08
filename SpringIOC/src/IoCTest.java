import com.nhjia.config.Appconfig;
import com.nhjia.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class IoCTest {
    private static Logger log = Logger.getLogger(String.valueOf(IoCTest.class));

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
        User user = ctx.getBean(User.class);
        log.info(user.getId());
    }
}
