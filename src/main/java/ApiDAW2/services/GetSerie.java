package ApiDAW2.services;

import ApiDAW2.domain.Serie;
import ApiDAW2.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetSerie {
    private SerieRepository serieRepository;

    @Autowired
    public GetSerie(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public Serie get(int idSerie){
        return serieRepository.findOne(idSerie);
    }
}
