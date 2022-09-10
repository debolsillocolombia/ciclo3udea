package com.proyecto.debolsilloColombia.entidades;


import javax.persistence.*;

@Entity
@Table(name = "MovimientoDinero ")
public class MovimientoDinero{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Column(name = "usuario")
    private String usuario;
    @Column(name = "consignar")
    private double consignar;
    @Column(name = "retirar")
    private double retirar;
    @Column(name = "saldoinit")
    private double saldoinit;

    public MovimientoDinero () {
    }

    public MovimientoDinero (String usuario , double consignar , double retirar , double saldoinit) {
        this.usuario   = usuario;
        this.consignar = consignar;
        this.retirar   = retirar;
        this.saldoinit = saldoinit;
    }

    public String getUsuario () {
        return usuario;
    }

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }

    public double getConsignar () {
        return consignar;
    }

    public void setConsignar (double consignar) {
        this.consignar = consignar;
    }

    public double getRetirar () {
        return retirar;
    }

    public void setRetirar (double retirar) {
        this.retirar = retirar;
    }

    public double getSaldoinit () {
        return saldoinit+getConsignar ()-getRetirar ();
    }

    public void setSaldoinit (double saldoinit) {
        this.saldoinit = saldoinit;
    }
}
