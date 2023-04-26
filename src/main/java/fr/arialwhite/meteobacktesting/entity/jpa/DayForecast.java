package fr.arialwhite.meteobacktesting.entity.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "forecast")
@Getter
@Setter
public class DayForecast {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "forecast_date")
    private LocalDate forecastDate;

    @Column(name = "delta")
    private Integer delta;

    @Column(name = "min_temp")
    private Integer minTemperature;

    @Column(name = "max_temp")
    private Integer maxTemperature;

    @Column(name = "min_wind_speed")
    private Integer minWindSpeed;

    @Column(name = "max_wind_speed")
    private Integer maxWindSpeed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meteo_source")
    private MeteoSource meteoSource;

    // getters and setters
}
