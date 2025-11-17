package org.esprim.gestionfoyer.services;

import lombok.AllArgsConstructor;
import org.esprim.gestionfoyer.entity.Foyer;
import org.esprim.gestionfoyer.entity.Universite;
import org.esprim.gestionfoyer.repositories.FoyerRepository;
import org.esprim.gestionfoyer.repositories.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceM implements UniversiteService {

    private final FoyerRepository foyerRepository;
    private final UniversityRepository universityRepository;

    // Plus besoin d'un constructeur manuel car @AllArgsConstructor s'en occupe

    @Override
    public List<Universite> retrieveAllUniversites() {
        return universityRepository.findAll();
    }

    @Override
    public Universite retrieveUniversite(Long idUniversite) {
        return universityRepository.findById(idUniversite)
                .orElseThrow(() -> new RuntimeException("Universite not found with id " + idUniversite));
    }

    @Override
    public Universite addUniversite(Universite universite) {
        return universityRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universityRepository.save(universite);
    }


    @Override
    public void removeUniversite(Long idUniversite) {
        universityRepository.deleteById(idUniversite);
    }

    @Override
    public Universite affecterFoyerAUniversite(Long idFoyer, String nomUniversite) {

        // 1. Récupérer foyer
        Foyer foyer = foyerRepository.findById(idFoyer)
                .orElseThrow(() -> new RuntimeException(
                        "Foyer not found with id " + idFoyer));


        // 2. Récupérer université
        Universite universite = universityRepository.findByNomUniversite(nomUniversite)
                .orElseThrow(() -> new RuntimeException(
                        "Universite not found with name " + nomUniversite));


        //Vérifier si l'association existe déja

        if (foyer.getUniversite() != null ||
                universite.getFoyer() != null) {
            throw new RuntimeException("L'association existe déja pour ce foyer" + "ou cette universite");
        }

        // 3. Lier foyer à université (affectation)
        universite.setFoyer(foyer);

        // 4. Sauvegarder mise à jour
        return universityRepository.save(universite);
    }


    @Override
    public Universite desaffecterFoyerAUniversite(long idUniversite) {

        Universite universite = universityRepository.findById(idUniversite)
                .orElseThrow(() -> new RuntimeException(
                        "Universite n'existe pas avec cet id : " + idUniversite));

        if (universite.getFoyer() == null) {
            throw new RuntimeException("Cette université n’a aucun foyer affecté.");
        }

        // . Désaffecter
         universite.setFoyer(null);
         universityRepository.save(universite);

         return universite;
    }
}
