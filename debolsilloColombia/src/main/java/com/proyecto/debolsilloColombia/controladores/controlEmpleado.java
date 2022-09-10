package com.proyecto.debolsilloColombia.controladores;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.servicios.servicioEmpleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.List;

@RestController
public class controlEmpleado{
    /* servicioEmpresa se1 = new servicioEmpresa ();
     Empresa emp1;
     public controlEmpresa(){
         this.emp1 = this.se1.getEmpresa();
     }
   @GetMapping("/informacion")

     public Empresa informacion(){
         return this.emp1;

 }
     */ servicioEmpleado emp1;

    public controlEmpleado (servicioEmpleado emp1) {
        this.emp1 = emp1;
    }

    @GetMapping("/informacion")
    public List<Empleado> informacion () {
        return this.emp1.getRepositorios ();
    }
}