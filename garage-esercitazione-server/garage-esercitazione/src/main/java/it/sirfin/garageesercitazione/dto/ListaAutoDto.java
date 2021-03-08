/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.garageesercitazione.dto;

import it.sirfin.garageesercitazione.model.Automobile;
import java.util.List;


public class ListaAutoDto {
    
    List<Automobile> listaAuto;

    public ListaAutoDto() {
    }

    public ListaAutoDto(List<Automobile> listaAuto) {
        this.listaAuto = listaAuto;
    }

    public List<Automobile> getListaAuto() {
        return listaAuto;
    }

    public void setListaAuto(List<Automobile> listaAuto) {
        this.listaAuto = listaAuto;
    }

    @Override
    public String toString() {
        return "ListaAutoDto{" + "listaAuto=" + listaAuto + '}';
    }
    
    
    
}
