package com.caso_aduana.tramites.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "agricola")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AgricolaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private  String nombre;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private boolean permitido;

    @Column(nullable = false)
    private  boolean requierein;
}
