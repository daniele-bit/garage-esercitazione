package it.sirfin.garageesercitazione.service;

import it.sirfin.garageesercitazione.dto.AutomobileReqDto;
import it.sirfin.garageesercitazione.dto.CriterioRicercaDto;
import it.sirfin.garageesercitazione.dto.ListaAutoDto;
import it.sirfin.garageesercitazione.model.Automobile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface GarageService {

    ListaAutoDto inserisci(Automobile auto);

    ListaAutoDto rimuovi(Automobile auto);

    ListaAutoDto aggiorna();

    ListaAutoDto ricerca(String stringa);

}
