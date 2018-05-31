package ApiDAW2.services;

import ApiDAW2.domain.Serie;
import ApiDAW2.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddSerie {

    private SerieRepository serieRepository;

    @Autowired
    public AddSerie(SerieRepository serieRepository){
        this.serieRepository = serieRepository;
    }
    public void add(Serie serie) {
        serieRepository.save(serie);
    }

}
