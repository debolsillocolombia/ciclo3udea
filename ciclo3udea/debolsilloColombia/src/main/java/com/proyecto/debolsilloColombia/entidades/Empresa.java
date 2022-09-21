package com.proyecto.debolsilloColombia.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Empresa")

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Empresa{



    @Id
    private long id;

    private String nombre;

    private String direccion;

    private int telefono;

    private String nit;
   @Transient
    Empleado empleado1;




}
