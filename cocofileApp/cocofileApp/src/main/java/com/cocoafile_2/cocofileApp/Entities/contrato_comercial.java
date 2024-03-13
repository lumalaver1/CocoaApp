package com.cocoafile_2.cocofileApp.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class contrato_comercial {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "fkId_Contrato", length = 10)
    private long Id;
    @Column( name= "monto_total")
    private long monto_total;

    @Column( name= "acuerdos")
    private String acuerdos;

}
