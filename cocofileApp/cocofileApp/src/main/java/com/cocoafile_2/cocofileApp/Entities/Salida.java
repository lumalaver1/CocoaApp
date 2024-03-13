package com.cocoafile_2.cocofileApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Salida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "Id_salida", length = 10)
    private long Id_salida;
    @Column( name= "cantidad_producto")
    private long cantidad_producto;

    @Column( name= "fecha_salida")
    private Date fecha_salida;


}
