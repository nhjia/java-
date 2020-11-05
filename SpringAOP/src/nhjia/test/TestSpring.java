package nhjia.test;

import nhjia.pojo.Project;
import com.nhjia.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationContext.xml" });
        ProductService s = (ProductService) context.getBean("s");
        s.doSomeService();


    }
}