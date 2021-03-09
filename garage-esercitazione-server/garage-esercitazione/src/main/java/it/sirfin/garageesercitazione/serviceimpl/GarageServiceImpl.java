
package it.sirfin.garageesercitazione.serviceimpl;

import it.sirfin.garageesercitazione.dto.ListaAutoDto;
import it.sirfin.garageesercitazione.model.Automobile;
import it.sirfin.garageesercitazione.repository.AutomobileRepository;
import it.sirfin.garageesercitazione.service.GarageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GarageServiceImpl implements GarageService{

    @Autowired
    AutomobileRepository automobileRepository;
    
    @Override
    public ListaAutoDto inserisci(Automobile auto) {
         automobileRepository.save(auto);
         return aggiorna();
    }

    @Override
    public ListaAutoDto rimuovi(Automobile auto) {
        automobileRepository.delete(auto);
        return aggiorna();
    }

    @Override
    public ListaAutoDto aggiorna() {
        List<Automobile> lista =  automobileRepository.findAll();
        return new ListaAutoDto(lista);
    }

    @Override
    public ListaAutoDto ricerca(String stringa) {
        List<Automobile> lista = automobileRepository.findByTargaContainsOrModelloContains(stringa, stringa);
        return new ListaAutoDto(lista);
    }
    
}
