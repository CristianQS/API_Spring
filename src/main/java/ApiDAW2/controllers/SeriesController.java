package ApiDAW2.controllers;

import ApiDAW2.domain.Serie;
import ApiDAW2.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SeriesController {

    private EditSerie editSerie;
    private DeleteSerie deleteSerie;
    private AddSerie addSerie;
    private GetAllSeries getAllSeries;
    private GetSerie getSerie;

    @Autowired
    public SeriesController(GetAllSeries getAllSeries, AddSerie addSerie, DeleteSerie deleteSerie, EditSerie editSerie,GetSerie getSerie){

        this.getAllSeries = getAllSeries;
        this.addSerie = addSerie;
        this.deleteSerie = deleteSerie;
        this.editSerie = editSerie;
        this.getSerie=getSerie;
    }

    @GetMapping("/")
    public List<Serie> getAllSeries () {
        return getAllSeries.execute();
    }
    @GetMapping("/{id}")
    public Serie getSerie(@PathVariable("id") int idSerie) {
        return getSerie.get(idSerie);
    }

    @PostMapping("/")
    public void addSerie(@RequestBody Serie serie){

        addSerie.add(serie);
    }
    @DeleteMapping("/{id}")
    public void deleteSerie(@PathVariable("id") int idSerie){
        deleteSerie.delete(idSerie);
    }

    @PutMapping("/{id}")
    public void updateSerie(@PathVariable("id") int idSerie ,@RequestBody Serie serie){

        editSerie.update(idSerie,serie);
    }

}
