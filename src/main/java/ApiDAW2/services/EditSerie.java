package ApiDAW2.services;

import ApiDAW2.domain.Serie;
import ApiDAW2.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditSerie {

    private SerieRepository serieRepository;

    @Autowired
    public EditSerie (SerieRepository serieRepository){

        this.serieRepository = serieRepository;

    }

    public void update(int idSerie, Serie serie) {
        serie.setId(idSerie);
        serieRepository.saveAndFlush(serie);
    }
}
