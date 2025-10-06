package org.esprim.gestionfoyer.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEtudiant;

        private String nomEt;
        private String prenomEt;
        private Long cin;
        private String ecole;
        private Date dateNaissance;
}
