package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Reservation;
import org.esprim.gestionfoyer.repositories.BlocRepository;
import org.esprim.gestionfoyer.repositories.ChambreRepository;
import org.esprim.gestionfoyer.repositories.EtudiantRepository;
import org.esprim.gestionfoyer.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReservationServicesM implements ReservationServices {

    private ReservationRepository reservationRepository;
    private EtudiantRepository etudiantRepository;
    private ChambreRepository chambreRepository;
    private BlocRepository blocRepository;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return List.of();
    }

    @Override
    public Reservation retrieveReservation(String idReservation) {
        return null;
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        return null;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return null;
    }

    @Override
    public void removeReservation(String idReservation) {

    }


}
