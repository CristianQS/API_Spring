package ApiDAW2.services;

import ApiDAW2.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteSerie {
    private SerieRepository serieRepository;

    @Autowired
    public DeleteSerie(SerieRepository serieRepository) {
        this.serieRepository = serieRepository;
    }

    public void delete(int idSerie) {
        serieRepository.delete(idSerie);
    }
}
