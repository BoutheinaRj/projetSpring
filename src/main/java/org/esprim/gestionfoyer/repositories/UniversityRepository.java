package org.esprim.gestionfoyer.repositories;

import org.esprim.gestionfoyer.entity.Foyer;
import org.esprim.gestionfoyer.entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UniversityRepository extends JpaRepository<Universite, Long>  {

Optional<Universite> findByNomUniversite(String nomUniversite);

}
