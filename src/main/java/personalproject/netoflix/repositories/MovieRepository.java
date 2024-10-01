package personalproject.netoflix.repositories;

// import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

import personalproject.netoflix.model.Movie;

// @Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
    // List<Movie> findByTitleContaining(String title);
    // List<Movie> findByDirectorContaining(String director);
    // List<Movie> findByGenreContaining(String genre);
    // List<Movie> findByStudioContaining(String studio);
    // List<Movie> findByYear(int year);
    // List<Movie> findByCastContaining(String cast);
    
}
