package org.esprim.gestionfoyer.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Data
@Getter
@Setter
@Entity
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;

}
