package fr.arialwhite.meteobacktesting.entity.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "observation")
@Getter
@Setter
public class DayObservation {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "observation_date")
    private LocalDate observationDate;

    @Column(name = "qualifier")
    private String qualifier;

    @Column(name = "temp")
    private Integer temperature;

    @Column(name = "wind_speed")
    private Integer windSpeed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meteo_source")
    private MeteoSource meteoSource;
}
