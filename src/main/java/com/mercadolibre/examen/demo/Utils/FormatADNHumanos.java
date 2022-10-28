package com.mercadolibre.examen.demo.Utils;

import org.springframework.stereotype.Component;

import com.mercadolibre.examen.demo.Entity.Humanos;

@Component
public class FormatADNHumanos {
    
    public Humanos formatADN(String[][] matriz){
        Humanos adn = new Humanos();
        adn.adn = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                adn.adn += matriz[i][j];
            }
            if (i < matriz.length - 1) {
                adn.adn += "-"; 
            }
        }
        return adn;
    }

}
