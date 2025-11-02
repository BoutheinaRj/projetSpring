package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idEtudiant;

        private String nomEt;
        private String prenomEt;
        private Long cin;
        private String ecole;

        @Temporal(TemporalType.DATE)
        private Date dateNaissance;

        @ManyToMany(cascade = CascadeType.ALL)
        @JoinTable(
                name = "etudiant_reservation",
                joinColumns = @JoinColumn(name = "id_etudiant"),
                inverseJoinColumns = @JoinColumn(name = "id_reservation")
        )
        private List<Reservation> reservations;
}
