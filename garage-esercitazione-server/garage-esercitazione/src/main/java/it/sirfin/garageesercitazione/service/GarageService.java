package it.sirfin.garageesercitazione.service;

import it.sirfin.garageesercitazione.dto.AutomobileReqDto;
import it.sirfin.garageesercitazione.dto.CriterioRicercaDto;
import it.sirfin.garageesercitazione.dto.ListaAutoDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface GarageService {

    ListaAutoDto insersci(AutomobileReqDto dto);

    ListaAutoDto rimuovi(AutomobileReqDto dto);

    ListaAutoDto aggiorna();

    ListaAutoDto ricerca(CriterioRicercaDto dto);

}
