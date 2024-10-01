package personalproject.netoflix.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {
    private int id;
    private String title;
    private String director;
    private String genre;
    private String studio;
    private Set<String> movieCast;
    private int year;
    private String poster;
}
