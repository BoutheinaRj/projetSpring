package org.esprim.gestionfoyer.repositories;

import org.esprim.gestionfoyer.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository; //génerer dao correspendante ... jpa spring data ..
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
    Optional<Foyer> findByNomFoyer(String nomFoyer);
}
