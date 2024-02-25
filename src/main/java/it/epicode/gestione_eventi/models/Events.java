package it.epicode.gestione_eventi.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "events_generator")
    private int id;

    private String title;
    private String description;
    private LocalDate date;
    private String luogo;
    private int free_spots;
    @ManyToMany(mappedBy = "user_id")
    private List<Users> users;

}
