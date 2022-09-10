package com.proyecto.debolsilloColombia.servicios;
import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.repositorios.repositorioEmpresa;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class servicioEmpresa{

    private repositorioEmpresa repositorios;

    public servicioEmpresa (repositorioEmpresa repositorios) {
        this.repositorios = repositorios;
    }

    public List<Empresa> getRepositorios () {
        return this.repositorios.findAll ();
    }
}
