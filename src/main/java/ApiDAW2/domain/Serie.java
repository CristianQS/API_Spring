package ApiDAW2.domain;

import javax.persistence.*;

@Entity
@Table(name = "series")
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int seasons;
    private String description;

    public void setId(int id) {
        this.id = id;
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
