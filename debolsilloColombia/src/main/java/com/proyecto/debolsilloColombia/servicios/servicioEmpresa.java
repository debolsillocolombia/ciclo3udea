package com.proyecto.debolsilloColombia.servicios;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.repositorios.repositorioEmpresa;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicioEmpresa{
   /*Empresa ep1;

    servicioEmpleado se1 = new servicioEmpleado ();
    public servicioEmpresa() {
        Empleado emple1 = this.se1.getEmpleado ( );
        this.ep1 = new Empresa ( "DEBOLSILLOCOLOMBIA" , "CRA 35 # 79-100" , 313 , "900-486518918" , emple1);
    }

    public Empresa getEmpresa ( ) {
        return this.ep1;
    }*/

    private repositorioEmpresa repositorios;

    public servicioEmpresa (repositorioEmpresa repositorios) {
        this.repositorios = repositorios;
    }

    public List<Empresa> getRepositorios () {
        return this.repositorios.findAll ();
    }
}
