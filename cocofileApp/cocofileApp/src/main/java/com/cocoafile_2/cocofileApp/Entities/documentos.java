package com.cocoafile_2.cocofileApp.Entities;
import jakarta.persistence.*;

import java.util.Date;
public class documentos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name= "Id_documentos", length = 10)
    private long Id;
    @Column( name= "Tipo_documento",length = 40)
    private String Tipo_documento;

    @Column( name= "version")
    private long version;

    @Column( name= "archivo", length = 200)
    private long archivo;
}
