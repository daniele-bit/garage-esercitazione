/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.garageesercitazione.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Automobile implements Serializable {

    @Id
    @GeneratedValue

    private Long id;

    @Column

    private String targa;

    @Column

    private String modello;

    @Column

    private Integer NPosti;

    public Automobile() {
    }

    public Automobile(String targa, String modello, Integer NPosti) {
        this.targa = targa;
        this.modello = modello;
        this.NPosti = NPosti;
    }

    public Long getId() {
        return id;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public Integer getNPosti() {
        return NPosti;
    }

    public void setNPosti(Integer NPosti) {
        this.NPosti = NPosti;
    }

    @Override
    public String toString() {
        return "Automobile{" + "id=" + id + ", targa=" + targa + ", modello=" + modello + ", NPosti=" + NPosti + '}';
    }

}
