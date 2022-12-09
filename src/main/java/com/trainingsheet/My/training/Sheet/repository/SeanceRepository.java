package com.trainingsheet.My.training.Sheet.repository;

import com.trainingsheet.My.training.Sheet.model.Seance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepository extends CrudRepository<Seance, Long> {

}
