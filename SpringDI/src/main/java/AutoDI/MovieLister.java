package AutoDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by happyangel on 2017/10/10.
 */

@Component
public class MovieLister {
    private MovieFinder finder;

    @Autowired
    public MovieLister(MovieFinder finder) {
        this.finder = finder;
    }

    public void showMovies() {
        System.out.println(String.join(" \n\n ", finder.findAll()));
    }
}
