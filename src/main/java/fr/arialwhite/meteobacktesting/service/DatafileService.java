package fr.arialwhite.meteobacktesting.service;

import fr.arialwhite.meteobacktesting.entity.map.DataFileEntity;
import fr.arialwhite.meteobacktesting.repository.map.DataFileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DatafileService {

    private final DataFileRepository dataFileRepository;

    public void testTheThing() {
        dataFileRepository.deleteAll();

        DataFileEntity entity = new DataFileEntity();
        entity.setFilename("test.png");
        dataFileRepository.save(entity);

        List<DataFileEntity> lastNameResults = dataFileRepository.findByFilename("test.png");
        log.info("got {} items", lastNameResults.size());
    }
}
