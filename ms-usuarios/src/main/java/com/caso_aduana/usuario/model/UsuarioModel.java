package com.caso_aduana.usuario.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @NotNull
    @Size(max = 8)
    @Column(name = "run", nullable = false, length = 8, unique = true)
    private String run;

    @NotNull
    @Column(name = "dv", nullable = false, length = 1)
    private Character dv;

    @NotNull
    @Size(max = 50)
    @Column(name = "pnombre", nullable = false, length = 50)
    private String pnombre;

    @Size(max = 50)
    @Column(name = "snombre", nullable = true, length = 50)
    private String snombre;

    @NotNull
    @Size(max = 50)
    @Column(name = "appaterno", nullable = false, length = 50)
    private String appaterno;

    @Size(max = 50)
    @Column(name = "apmaterno", nullable = true, length = 50)
    private String apmaterno;

    @NotNull
    @Email
    @Size(max = 150)
    @Column(name = "correo", nullable = false, length = 150)
    private String correo;

    @NotNull
    @Column(name = "fecha_nac", nullable = false)
    private LocalDate fechaNac;

}
