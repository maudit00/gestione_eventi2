package it.epicode.gestione_eventi.repositories;

import it.epicode.gestione_eventi.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface usersRepo extends JpaRepository<Users, Integer>, PagingAndSortingRepository<Users, Integer> {

}
