package com.proyecto.debolsilloColombia.controladores;


import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.entidades.Empresa;
import com.proyecto.debolsilloColombia.servicios.servicioEmpleado;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class controlEmpleado{

    servicioEmpleado se20;

    public controlEmpleado (servicioEmpleado se20) {
        this.se20 = se20;
    }

    @GetMapping("/empleados")
    public List<Empleado> listaEmpleados () {
        return this.se20.getListaEmpleado ();
    }

    @GetMapping("/empleados/{id}")
    public Empleado llamarEmpleados (@PathVariable Long id) {
        return this.se20.getLLamarEmpleado ( id );
    }


    @PostMapping("/empleados")
    public Empleado nuevaEmpleado (@RequestBody Empleado m, Model model) {
        model.addAttribute ( m );
        return this.se20.nuevaEmpleado ( m );
    }



    @PutMapping("/empleados/{id}")
    public Empleado actualizarEmpleado (@PathVariable Long id , @RequestBody Empleado actualizarEmpleado) {
        return this.se20.actualizarEmpleado ( id , actualizarEmpleado );
    }


    @DeleteMapping("/empleados/{id}")
    public Empleado eliminarEmpleado (@PathVariable Long id) {
        return this.se20.eliminarEmpleado ( id );
    }


}
