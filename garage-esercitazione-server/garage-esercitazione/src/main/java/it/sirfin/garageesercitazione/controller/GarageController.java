package it.sirfin.garageesercitazione.controller;

import it.sirfin.garageesercitazione.dto.AutomobileReqDto;
import it.sirfin.garageesercitazione.dto.CriterioRicercaDto;
import it.sirfin.garageesercitazione.dto.ListaAutoDto;
import it.sirfin.garageesercitazione.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class GarageController {

    @Autowired
    GarageService garageservice;           

    @RequestMapping("/inserisci-auto")
    @ResponseBody
    public ListaAutoDto inserisci(@RequestBody AutomobileReqDto dto) {
        return garageservice.inserisci(dto.getAutomobile());
    }

    @RequestMapping("/rimuovi-auto")
    @ResponseBody
    public ListaAutoDto rimuovi(@RequestBody AutomobileReqDto dto) {
        return garageservice.rimuovi(dto.getAutomobile());
    }

    @RequestMapping("/aggiorna")
    @ResponseBody
    public ListaAutoDto aggiorna() {
        return garageservice.aggiorna();
    }

    @RequestMapping("/ricerca-auto")
    @ResponseBody
    public ListaAutoDto ricerca(@RequestBody CriterioRicercaDto dto) {
     return garageservice.ricerca(dto.getStringa());
    }


}
