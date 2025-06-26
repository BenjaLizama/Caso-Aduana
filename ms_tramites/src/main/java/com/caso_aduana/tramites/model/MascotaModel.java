package com.caso_aduana.tramites.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "mascota")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MascotaModel {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 @Column
 private String nombre;

 @Column
 private String raza;


}
