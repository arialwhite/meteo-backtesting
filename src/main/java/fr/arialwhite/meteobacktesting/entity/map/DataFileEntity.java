package fr.arialwhite.meteobacktesting.entity.map;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.keyvalue.annotation.KeySpace;

@KeySpace("datafile")
@Data
public class DataFileEntity {

    @Id
    Long id;
    String filename;
}
