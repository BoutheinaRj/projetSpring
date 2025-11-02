package org.esprim.gestionfoyer.repositories;

import org.esprim.gestionfoyer.entity.Foyer;
import org.springframework.data.jpa.repository.JpaRepository; //génerer dao correspendante ... jpa spring data ..
import org.springframework.stereotype.Repository;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer, Long> {
}
