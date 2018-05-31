package ApiDAW2.services;

import ApiDAW2.domain.Serie;
import ApiDAW2.repositories.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllSeries {


    private SerieRepository serieRepository;

    @Autowired
    public GetAllSeries (SerieRepository serieRepository){


        this.serieRepository = serieRepository;
    }
    public List<Serie> execute() {
        return serieRepository.findAll();
    }



}
