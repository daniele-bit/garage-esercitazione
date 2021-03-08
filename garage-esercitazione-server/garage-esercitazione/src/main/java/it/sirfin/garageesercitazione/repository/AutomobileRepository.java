/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.garageesercitazione.repository;

import it.sirfin.garageesercitazione.model.Automobile;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AutomobileRepository extends JpaRepository<Automobile, Long>{
    List<Automobile> findByTargaContainsOrModelloContains(String c, String m);
    
}
