package com.mercadolibre.examen.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolibre.examen.demo.Model.ADNPersona;
import com.mercadolibre.examen.demo.Model.Stats;
import com.mercadolibre.examen.demo.Service.StatsService;
import com.mercadolibre.examen.demo.Service.XMenService;

@RestController
public class DemoController {
    
    @Autowired
    XMenService xmenService;

    @Autowired
    StatsService statsService;

    @RequestMapping(path = "/v1/mutant", method = RequestMethod.POST)
    public Boolean Validar(@RequestBody ADNPersona persona){

        return xmenService.processADN(persona.adn);
        
    }

    @RequestMapping(path = "/v1/stats", method = RequestMethod.GET)
    public Stats Totales(){ 
        return statsService.getStats();
    }

    @RequestMapping(path = "/v1/reset", method = RequestMethod.DELETE)
    public void Delete(){ 
        xmenService.deleteRows();
    }
}
