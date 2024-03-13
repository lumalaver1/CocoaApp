package com.cocoafile_2.cocofileApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "Id_Inventario", length = 10)
    private long Id;
    @Column( name= "producto",length = 30)
    private String producto;

    @Column( name= "cantidad")
    private long cantidad;

    @Column( name= "fecha_vencimiento")
    private Date fecha_vencimiento;



    @Column( name= "fkId_campesino", length = 11)
    private long fkId_campesino;

    @Column( name= "fkId_entrada", length = 11)
    private long fkId_entrada;

    @Column( name= "fkId_salida", length = 11)
    private long fkId_salida;


}
