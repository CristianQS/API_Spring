package ApiDAW2.controllers;

import ApiDAW2.domain.Serie;
import ApiDAW2.services.GetAllSeries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeriesController {

    private GetAllSeries getAllSeries;

    @Autowired
    public SeriesController(GetAllSeries getAllSeries){

        this.getAllSeries = getAllSeries;
    }

    @GetMapping("/")
    public List<Serie> index () {
        return getAllSeries.execute();
    }

}
