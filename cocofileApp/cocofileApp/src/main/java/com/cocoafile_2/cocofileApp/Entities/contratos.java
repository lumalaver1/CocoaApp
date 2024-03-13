package com.cocoafile_2.cocofileApp.Entities;
import jakarta.persistence.*;

import java.util.Date;

public class contratos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "Id_Contrato", length = 10)
    private long Id;
    @Column( name= "fecha_inicio")
    private Date fecha_inicio;

    @Column( name= "fecha_fin")
    private long fecha_fin;



    @Column( name= "fkId_documento", length = 11)
    private long fkId_documento;
}
