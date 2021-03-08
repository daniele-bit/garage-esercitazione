/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.garageesercitazione.dto;

import it.sirfin.garageesercitazione.model.Automobile;

public class AutomobileReqDto {
    
    
   private Automobile automobile;

    public AutomobileReqDto() {
    }

    public AutomobileReqDto(Automobile automobile) {
        this.automobile = automobile;
    }

    public Automobile getAutomobile() {
        return automobile;
    }

    public void setAutomobile(Automobile automobile) {
        this.automobile = automobile;
    }

    @Override
    public String toString() {
        return "AutomobileReqDto{" + "automobile=" + automobile + '}';
    }
   
   
    
}
