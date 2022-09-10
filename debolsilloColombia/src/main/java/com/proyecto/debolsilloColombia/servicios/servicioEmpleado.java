package com.proyecto.debolsilloColombia.servicios;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.repositorios.repositorioEmpleado;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicioEmpleado{
   /*Empresa ep1;

    servicioEmpleado se1 = new servicioEmpleado ();
    public servicioEmpresa() {
        Empleado emple1 = this.se1.getEmpleado ( );
        this.ep1 = new Empresa ( "DEBOLSILLOCOLOMBIA" , "CRA 35 # 79-100" , 313 , "900-486518918" , emple1);
    }

    public Empresa getEmpresa ( ) {
        return this.ep1;
    }*/

    private repositorioEmpleado repositorios;

    public servicioEmpleado (repositorioEmpleado repositorios) {
        this.repositorios = repositorios;
    }

    public List<Empleado> getRepositorios () {
        return this.repositorios.findAll ();
    }
}
