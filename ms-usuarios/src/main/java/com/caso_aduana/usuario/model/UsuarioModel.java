package com.caso_aduana.usuario.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Table(name = "usuario")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @Size(max = 12)
    @Column(name = "run", nullable = false, length = 8)
    private String run;

    @Column(name = "dv", nullable = false, length = 1)
    private Character dv;

    @Column(name = "pnombre", nullable = false, length = 50)
    private String pnombre;

    @Column(name = "snombre", nullable = true, length = 50)
    private String snombre;
    private String appaterno;
    private String apmaterno;
    private String correo;
    private Date fecha_nac;

}
