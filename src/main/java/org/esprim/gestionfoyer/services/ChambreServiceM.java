package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Chambre;
import org.esprim.gestionfoyer.entity.TypeChambre;
import org.esprim.gestionfoyer.repositories.ChambreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChambreServiceM implements ChambreService {

    private final ChambreRepository chambreRepository;

    public ChambreServiceM(ChambreRepository chambreRepository) {
        this.chambreRepository = chambreRepository;
    }

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

    @Override
    public List<Chambre> getChambresParNomUniversite(String nomUniversite) {
        return chambreRepository.findChambreByNomUniversite(nomUniversite);
    }
    @Override
    public List<Chambre> getChambresParBlocEtType(long idBloc, TypeChambre typeC) {
        return chambreRepository.trouverChambresByBlocAndType(idBloc, typeC);
    }



}
