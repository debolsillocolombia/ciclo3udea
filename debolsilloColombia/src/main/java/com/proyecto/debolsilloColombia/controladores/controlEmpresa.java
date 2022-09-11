package com.proyecto.debolsilloColombia.controladores;

import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.servicios.servicioEmpresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;
import java.util.List;

@RestController
public class controlEmpresa{
     servicioEmpresa se1;
    public controlEmpresa (servicioEmpresa se1) {
        this.se1 = se1;
    }

    @GetMapping("/informacion")
    public List<Empresa> informacion () {
        return this.se1.getRepositorios ();
    }
}
