package com.cocoafile_2.cocofileApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class contrato_laboral {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "fkId_Contrato", length = 10)
    private long Id;
    @Column( name= "Salario")
    private long Salario;

    @Column( name= "funciones")
    private String funciones;
}
