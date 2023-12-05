package org.example.banque.repositories;

import org.example.banque.entities.compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<compte, Long> {

}
