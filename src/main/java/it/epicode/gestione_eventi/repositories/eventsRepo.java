package it.epicode.gestione_eventi.repositories;

import it.epicode.gestione_eventi.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface eventsRepo extends JpaRepository<Events,Integer>, PagingAndSortingRepository<Events, Integer> {
}
