import com.google.inject.AbstractModule;

/**
 * Created by happyangel on 2017/12/31.
 */
public class DIModule extends AbstractModule {

    protected void configure() {
        bind(MovieFinder.class).to(FileMovieFinder.class);
    }
}
