package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Universite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    // 🔹 Relation OneToOne avec Foyer (le foyer est le fils)
    @OneToOne
    @JoinColumn(name = "id_foyer")
    private Foyer foyer;
}
