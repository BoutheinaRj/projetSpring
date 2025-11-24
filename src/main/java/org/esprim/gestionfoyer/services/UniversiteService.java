package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Chambre;
import org.esprim.gestionfoyer.entity.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversite(Long idUniversite);
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite universite);
    void removeUniversite(Long idUniversite);

    public Universite affecterFoyerAUniversite(Long idFoyer, String nomFoyer);
    Universite desaffecterFoyerAUniversite(long idUniversite);

}
