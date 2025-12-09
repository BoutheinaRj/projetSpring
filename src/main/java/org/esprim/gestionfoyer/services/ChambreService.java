package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Chambre;
import org.esprim.gestionfoyer.entity.TypeChambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre retrieveChambre(Long idchambre);

    Chambre addChambre(Chambre c);

    void removeChambre(Long idchambre);

    Chambre modifyChambre(Chambre chambre);

    Chambre updateChambre(Chambre c);

    List<Chambre> getChambresParNomUniversite(String nomUniversite);
    List<Chambre> getChambresParBlocEtType (long idBloc, TypeChambre typeC) ;
    // Services de scheduling
    void pourcentageChambreParTypeChambre();        // Service 02
    void nbPlacesDisponibleParChambreAnneeEnCours();
}