package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Chambre;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChambreServiceM implements ChambreService {

    @Override
    public List<Chambre> retrieveAllChambres() {
        return List.of();
    }

    @Override
    public Chambre retrieveChambre(Long idchambre) {
        return null;
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return null;
    }

    @Override
    public void removeChambre(Long idchambre) {

    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return null;
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return null;
    }
}
