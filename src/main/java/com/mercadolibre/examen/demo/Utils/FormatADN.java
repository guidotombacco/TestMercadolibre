package com.mercadolibre.examen.demo.Utils;

import org.springframework.stereotype.Component;

import com.mercadolibre.examen.demo.Entity.ADN;

@Component
public class FormatADN {
    
    public ADN formatADN(String[][] matriz){
        ADN adn = new ADN();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                adn.adn += matriz[i][j];
            }
            if (i < matriz.length) {
                adn.adn += "-"; 
            }
        }
        return adn;
    }

}
