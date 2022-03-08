package com.examen.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "evento")

public class Evento implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String lugar;
    private String fecha;
    private String cap_maxima;
    private String costo;

    @ManyToOne
    @JoinColumn(name = "artista_id")

    public long getId() {
        return id;
    }

    @Id
    public String getLugar() {
        return lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCap_maxima() {
        return cap_maxima;
    }

    public String getCosto() {
        return costo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCap_maxima(String cap_maxima) {
        this.cap_maxima = cap_maxima;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
    
    

}
