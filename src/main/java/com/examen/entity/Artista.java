
package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="paises")

public class Artista implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private long id;
    private String artista;

    public long getId() {
        return id;
    }

    public String getArtista() {
        return artista;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    

}
