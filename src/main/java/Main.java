import AutoDI.AudoDIConfig;
import AutoDI.MovieLister;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by happyangel on 2017/10/10.
 */

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AudoDIConfig.class);
        MovieLister lister = context.getBean(MovieLister.class);
        lister.showMovies();
        context.close();
    }
}

