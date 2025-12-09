package org.esprim.gestionfoyer.repositories;

import org.esprim.gestionfoyer.entity.Bloc;
import org.esprim.gestionfoyer.entity.Chambre;
import org.esprim.gestionfoyer.entity.Etudiant;
import org.esprim.gestionfoyer.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
    public interface ChambreRepository extends JpaRepository<Chambre, Long> {
        List<Chambre> findByBlocIdBloc(Long idBloc);
    }

    public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
        Etudiant findByCin(long cin);
    }

    public interface ReservationRepository extends JpaRepository<Reservation, String> {
        Reservation findByEtudiantCin(long cin);
        int countByChambreIdChambre(long idChambre);
    }

}
