package com.cocoafile_2.cocofileApp.Entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Campesino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "Id_Campesino", length = 10)
    private long Id;

    @Column( name= "NomCampesino", length = 100)
    private String NomCampesino;

    @Column( name= "CodCampesino", length = 100)
    private long CodCampesino;

    @Column( name= "TelCampesino", length = 10)
    private long  Telcampesino;


    @Column( name= "fkcod_contrato_comericial", length = 11)
    private long fkcod_contrato_comericial;


}
