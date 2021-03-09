package it.sirfin.garageesercitazione.controller;

import it.sirfin.garageesercitazione.dto.AutomobileReqDto;
import it.sirfin.garageesercitazione.dto.CriterioRicercaDto;
import it.sirfin.garageesercitazione.dto.ListaAutoDto;
import it.sirfin.garageesercitazione.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    public ListaAutoDto insersci(@ResponseBody AutomobileReqDto dto) {}

    @RequestMapping("/inserisci-auto")
    @ResponseBody
    public ListaAutoDto rimuovi(@ResponseBody AutomobileReqDto dto) {
    }

    @RequestMapping("/inserisci-auto")
    @ResponseBody
    public ListaAutoDto aggiorna() {}

    @RequestMapping("/inserisci-auto")
    @ResponseBody
    public ListaAutoDto ricerca(@ResponseBody CriterioRicercaDto dto) {}


}
