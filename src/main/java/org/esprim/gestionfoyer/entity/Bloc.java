package org.esprim.gestionfoyer.entity;

import jakarta.persistence.*;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc ;
}
