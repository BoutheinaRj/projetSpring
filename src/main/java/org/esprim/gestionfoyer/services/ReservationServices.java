package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Reservation;

import java.util.List;

public interface ReservationServices {
    List<Reservation> retrieveAllReservations();
    Reservation retrieveReservation(String idReservation);
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void removeReservation(String idReservation);
}
