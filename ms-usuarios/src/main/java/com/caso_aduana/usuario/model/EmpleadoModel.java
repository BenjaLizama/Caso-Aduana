package com.caso_aduana.usuario.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleado")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoModel extends UsuarioModel {

    @NotNull
    @Column(name = "sueldo", nullable = false)
    private Double sueldo;

}
