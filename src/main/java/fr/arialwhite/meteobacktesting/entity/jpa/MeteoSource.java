package fr.arialwhite.meteobacktesting.entity.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "observation")
@Getter
@Setter
public class MeteoSource {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Integer name;

    @Column
    private Integer description;

    @OneToMany(mappedBy = "meteoSource", cascade = CascadeType.ALL)
    private List<DayForecast> forecasts = new ArrayList<>();

    @OneToMany(mappedBy = "meteoSource", cascade = CascadeType.ALL)
    private List<DayForecast> observations = new ArrayList<>();
}
