package com.cocoafile_2.cocofileApp.Entities;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name= "Id_Empleado", length = 10)
    private long Id_empleado;

    @Column( name= "NomEmpleado", length = 50)
    private String NomEmpleado;

    @Column( name= "ApellEmpleado", length = 50)
    private String ApellEmpleado;
    @Column( name= "Localidad", length = 50)
    private String Localidad;
    @Column( name= "Barrio", length = 50)
    private String Barrio;
    @Column( name= "fecha_nacimiento")
    private Date fecha_nacimiento;
    @Column( name= "direccion")
    private long  direccion;
    @Column( name= "foto",length = 100)
    private long  foto;

    @Column( name= "fkcod_contrato", length = 11)
    private long fkcod_contrato_comericial;

    @Column( name= "email",length = 100)
    private String  email;
    @Column( name= "contraseña",length = 30)
    private String  contraseña;
}







