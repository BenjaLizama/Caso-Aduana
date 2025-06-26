package com.caso_aduana.tramites.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "vehiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VehiculoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvehiculo;
    @Column(nullable = false)
    private String patente;


    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "idTvehiculo",nullable = true) //relacion debe ser notnull
    @JsonManagedReference
    private TipoVehiculo tipoVehiculo;

}
