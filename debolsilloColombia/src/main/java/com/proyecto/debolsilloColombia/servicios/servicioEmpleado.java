package com.proyecto.debolsilloColombia.servicios;

import com.proyecto.debolsilloColombia.entidades.Empleado;

public
class servicioEmpleado{

    Empleado emp1;
    public servicioEmpleado(){
        this.emp1=new Empleado ( "daniel","daniel@correo.com","DEBOLSILLOCOLOMBIA","developer", null);
    }

    public Empleado getEmpleado(){
    return this.emp1;
    }
}
