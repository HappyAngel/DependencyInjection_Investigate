import DIExample.MovieLister;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by LeiXi on 2017/10/10.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("movie.xml");
        MovieLister lister = context.getBean(MovieLister.class);
        lister.showMovies();
        context.close();
    }
}
