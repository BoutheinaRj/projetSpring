package org.esprim.gestionfoyer.services;

import org.esprim.gestionfoyer.entity.Chambre;
import org.esprim.gestionfoyer.entity.Etudiant;

import java.util.List;

public interface EtudiantServices {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant retrieveEtudiant(Long idet);
    Etudiant addEtudiant(Etudiant e);
    void  removeEtudiant(Etudiant e);
    Etudiant updateEtudiant(Etudiant e);
    Etudiant getEtudiant(Long idet);
    Etudiant modifyEtudiant(Etudiant e);

}
