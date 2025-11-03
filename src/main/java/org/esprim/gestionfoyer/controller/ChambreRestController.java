package org.esprim.gestionfoyer.controller;

import lombok.AllArgsConstructor;
import org.esprim.gestionfoyer.entity.Chambre;
import org.esprim.gestionfoyer.services.ChambreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreRestController {

    private final ChambreService chambreService;

    // 🔹 GET : récupérer toutes les chambres
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> retrieveAllChambres() {
        return chambreService.retrieveAllChambres();
    }

    // 🔹 GET : récupérer une chambre par ID
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambreById(@PathVariable("chambre-id") Long chambreId) {
        return chambreService.retrieveChambre(chambreId);
    }

    // 🔹 POST : ajouter une chambre
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);
    }

    // 🔹 DELETE : supprimer une chambre
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chambreId) {
        chambreService.removeChambre(chambreId);
    }

    // 🔹 PUT : modifier une chambre
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        return chambreService.updateChambre(c);
    }
}
