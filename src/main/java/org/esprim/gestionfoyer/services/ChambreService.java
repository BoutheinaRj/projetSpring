package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Chambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre retrieveChambre(Long idchambre);

    Chambre addChambre(Chambre c);

    void removeChambre(Long idchambre);

    Chambre modifyChambre(Chambre chambre);

    Chambre updateChambre(Chambre c);
}