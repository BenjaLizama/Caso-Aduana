package com.caso_aduana.tramites.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "tipovehiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TipoVehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String ntipovehiculo;

    @OneToMany(mappedBy = "tipovehiculo")
    @JsonBackReference
    private VehiculoModel vehiculoModel;

}
