import com.google.inject.Inject;

/**
 * Created by happyangel on 2017/10/10.
 */

public class MovieLister {
    private MovieFinder finder;

    @Inject
    public MovieLister(MovieFinder finder) {
        this.finder = finder;
    }

    public void showMovies() {
        System.out.println(String.join(" \n\n ", finder.findAll()));
    }
}
