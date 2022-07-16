package jana60.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.model.University;

  //le due variabili:NomeModel.java e l'int(dovrebbe riferirsi alla chiave primaria,ossia la colonna id)
@Repository                                                    
public interface UniversityRepository extends CrudRepository <University, Integer> {

	
}

