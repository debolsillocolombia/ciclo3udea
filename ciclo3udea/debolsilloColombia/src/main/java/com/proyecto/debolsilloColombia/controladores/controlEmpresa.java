package com.proyecto.debolsilloColombia.controladores;

import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.servicios.servicioEmpresa;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Provider;
import java.util.List;

@RestController
public class controlEmpresa{
    servicioEmpresa se10;

    public controlEmpresa (servicioEmpresa se10) {
        this.se10 = se10;
    }

    @GetMapping("/empresas")
    public List<Empresa> listaEmpresas () {
        return this.se10.getListaEmpresas ();
    }

    @GetMapping("/empresas/{id}")
    public Empresa llamarEmpresas (@PathVariable Long id) {
        return this.se10.getLLamarEmpresas ( id );
    }

/*
    @PostMapping("/empresas")
    public Empresa nuevaEmpresa(@RequestBody Empresa e){
        return this.se10.nuevaEmpresa(e);
    }


 */
    public RedirectView nuevaEmpresa(@ModelAttribute Empresa e, Model model){
        model.addAttribute ( e );
        this.se10.nuevaEmpresa(e);
        return new RedirectView ("/empresas");

    }


    @PutMapping("/empresas/{id}")
    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa actualizarEmpresa){
        return this.se10.actualizarEmpresa (id, actualizarEmpresa);
    }


    @DeleteMapping("/empresas/{id}")
    public Empresa eliminarEmpresa(@PathVariable Long id){
        return this.se10.eliminarEmpresa(id);
    }

}
