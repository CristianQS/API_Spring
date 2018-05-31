package ApiDAW2.domain;

import javax.persistence.*;

@Entity
@Table(name = "series")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int id;
    private String name;
    private int seasons;
    private String description;

    public Serie(){
        id=0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSeasons() {
        return seasons;
    }

    public String getDescription() {
        return description;
    }
}
