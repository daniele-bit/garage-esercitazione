package it.sirfin.garageesercitazione.dto;

public class CriterioRicercaDto {

    public String stringa;

    public CriterioRicercaDto() {
    }

    public CriterioRicercaDto(String stringa) {
        this.stringa = stringa;
    }

    public String getStringa() {
        return stringa;
    }

    public void setStringa(String stringa) {
        this.stringa = stringa;
    }

    @Override
    public String toString() {
        return "CriterioRicercaDto{" + "stringa=" + stringa + '}';
    }
    
    
    
}
