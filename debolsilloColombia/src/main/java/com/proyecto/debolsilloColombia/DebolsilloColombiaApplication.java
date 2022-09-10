package com.proyecto.debolsilloColombia;

import com.proyecto.debolsilloColombia.entidades.Empleado;
import com.proyecto.debolsilloColombia.entidades.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class DebolsilloColombiaApplication
    {
        public static void main(String[] args){
            SpringApplication.run( DebolsilloColombiaApplication.class , args );

            Empleado emp1=new Empleado( "SERGIO" , "SERIO@CORREO.COM" , "DEBOLSILLOCOLOMBIA" , "SCRUM_MASTER" , null );
            Empresa  ep1 =new Empresa( "DEBOLSILLOCOLOMBIA" , "CRA 35 # 79-100" , 313 , "900-486518918" , emp1 );

            System.out.print( ep1.toString() );
        }
    }
