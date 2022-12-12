package com.trainingsheet.My.training.Sheet.service;


import com.trainingsheet.My.training.Sheet.model.Seance;
import com.trainingsheet.My.training.Sheet.repository.SeanceRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class SeanceService {

    @Autowired
    private SeanceRepository seanceRepository ;

    public Iterable<Seance> getAllSeances (){
        return seanceRepository.findAll();
    }

    public Optional<Seance> getSeanceById(final int id){
        return seanceRepository.findById((long) id);
    }

    public void deleteSeanceBYId(final int id){
        seanceRepository.deleteById((long) id);
    }



    public void deleteSeance(Seance s){
        seanceRepository.delete(s);
    }


    public Seance saveSeance(Seance s){
        return seanceRepository.save(s);
    }

    public Iterable<Seance> saveSeances(Iterable<Seance> seances){
        return seanceRepository.saveAll(seances);
    }


}
