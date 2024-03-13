package com.cocoafile_2.cocofileApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Entrada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "Id_entrada", length = 10)
    private long Id_entrada;
    @Column( name= "cantidad_producto")
    private long cantidad_producto;

    @Column( name= "fecha_entrada")
    private Date fecha_entrada;

    @Column( name= "fkId_compra", length = 11)
    private long fkId_compra;
}
