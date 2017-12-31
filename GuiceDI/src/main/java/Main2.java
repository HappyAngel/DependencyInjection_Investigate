import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by happyangel on 2017/12/31.
 */
public class Main2 {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DIModule());
        injector.getInstance(MovieLister.class).showMovies();
    }
}