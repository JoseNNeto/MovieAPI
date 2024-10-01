package personalproject.netoflix.model;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Title is mandatory")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "Director is mandatory")
    @Column(nullable = false)
    private String director;

    @NotBlank(message = "Genre is mandatory")
    @Column(nullable = false)
    private String genre;

    @NotBlank(message = "Studio is mandatory")
    @Column(nullable = false)
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private Set<String> movieCast;

    @NotBlank(message = "Description is mandatory")
    @Column(nullable = false)
    private int year;
    
    @NotBlank(message = "Description is mandatory")
    @Column(nullable = false)
    private String poster;

}
