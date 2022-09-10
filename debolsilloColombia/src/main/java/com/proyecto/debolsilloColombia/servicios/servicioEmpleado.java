package com.proyecto.debolsilloColombia.servicios;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.repositorios.repositorioEmpleado;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicioEmpleado{
      private repositorioEmpleado repositorios;

    public servicioEmpleado (repositorioEmpleado repositorios) {
        this.repositorios = repositorios;
    }

    public List<Empleado> getRepositorios () {
        return this.repositorios.findAll ();
    }
}
