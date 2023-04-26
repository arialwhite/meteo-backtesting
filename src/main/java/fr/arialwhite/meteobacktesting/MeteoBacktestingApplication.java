package fr.arialwhite.meteobacktesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.map.repository.config.EnableMapRepositories;

@SpringBootApplication(scanBasePackages = {
		"fr.arialwhite.meteobacktesting"
})
@EnableMapRepositories("fr.arialwhite.meteobacktesting.repository.map")
public class MeteoBacktestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeteoBacktestingApplication.class, args);
	}

}
