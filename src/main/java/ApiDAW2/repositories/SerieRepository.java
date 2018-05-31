package ApiDAW2.repositories;

import ApiDAW2.domain.Serie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends JpaRepository<Serie,Integer> {

}
