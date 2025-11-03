package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Etudiant;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantServicesM implements EtudiantServices{

    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return List.of();
    }

    @Override
    public Etudiant retrieveEtudiant(Long idet) {
        return null;
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public void removeEtudiant(Etudiant e) {

    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return null;
    }

    @Override
    public Etudiant getEtudiant(Long idet) {
        return null;
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant e) {
        return null;
    }
}
