package com.proyecto.debolsilloColombia.repositorios;
import com.proyecto.debolsilloColombia.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioEmpleado extends JpaRepository<Empleado, Long>{
}



