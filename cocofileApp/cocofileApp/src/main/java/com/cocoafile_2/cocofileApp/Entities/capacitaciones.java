package com.cocoafile_2.cocofileApp.Entities;
import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;
public class capacitaciones {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )

    @Column( name= "Id_referencia", length = 10)
    private long Id_referencia;

    @Column( name= "hora_capacitacion")
    private Time hora_capacitacion;

    @Column( name= "fecha_capacitacion")
    private Date fecha_capacitacion;

    @Column( name= "fkId_campesino")
    private long fkcod_campesino;

    @Column( name= "fkId_documento")
    private long fkcod_documento;

    @Column( name= "tipo_Capacitacion",length = 70)
    private String tipo_Capacitacion;

}
