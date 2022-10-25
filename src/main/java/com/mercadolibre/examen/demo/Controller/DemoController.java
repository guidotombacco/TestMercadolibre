package com.mercadolibre.examen.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mercadolibre.examen.demo.Service.XMenService;

@RestController
public class DemoController {
    
    @Autowired
    XMenService service;

    @RequestMapping(path = "/v1/persons", method = RequestMethod.GET)
    public Boolean Test(){

        String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCATTT"};

        return service.processADN(dna);
        
    }
}
