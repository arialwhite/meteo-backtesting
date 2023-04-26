package fr.arialwhite.meteobacktesting.repository.map;

import fr.arialwhite.meteobacktesting.entity.map.DataFileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DataFileRepository extends CrudRepository<DataFileEntity, Long> {

    List<DataFileEntity> findByFilename(String filename);
}
