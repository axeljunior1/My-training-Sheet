package com.trainingsheet.My.training.Sheet.controller;

import com.trainingsheet.My.training.Sheet.model.Seance;
import com.trainingsheet.My.training.Sheet.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SeanceController {

    @Autowired
    private SeanceService seanceService;


    @CrossOrigin
    @GetMapping("/seances")
    Iterable<Seance> getAllSeances(){
        return  seanceService.getAllSeances();
    }

    @CrossOrigin
    @GetMapping("/seances/{id}")
    Optional<Seance> getSeanceById(@PathVariable ("id") final int id ){
      return   seanceService.getSeanceById(id);
    }

    @CrossOrigin
    @PostMapping("/seance")
    Seance saveSeance ( @RequestBody Seance s){
       return seanceService.saveSeance(s);
    }

    @CrossOrigin
    @PostMapping("/seances")
    Iterable<Seance> saveSeances ( @RequestBody Iterable<Seance> seances){
        return seanceService.saveSeances(seances);
    }

    @CrossOrigin
    @DeleteMapping("/seances/{id}")
    void deleteSeance(@PathVariable("id") final int id){
        seanceService.deleteSeanceBYId(id);
    }

    @CrossOrigin
    @PutMapping("/seances/{id}")
    Seance updateSeance(@PathVariable("id") final int id, @RequestBody Seance seance ){
        Optional<Seance> ExistingSeance = seanceService.getSeanceById(id);
        if (ExistingSeance.isPresent()){
            Seance s =  ExistingSeance.get();
            if (seance.getImage() !=null) s.setImage(seance.getImage());
            if (seance.getDiscipline() !=null) s.setDiscipline(seance.getDiscipline());
             seanceService.saveSeance(s);
             return s ;
        }
        return null ;
    }


}
