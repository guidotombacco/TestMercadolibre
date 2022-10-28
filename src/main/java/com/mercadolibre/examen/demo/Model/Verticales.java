package com.mercadolibre.examen.demo.Model;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Verticales {
    
    public HashMap<Integer, String> verticales;

    private Integer mutantCounter = 0;

    public void setVerticales(String[][] matriz){
        HashMap<Integer, String> lines = new HashMap<Integer, String>();
        for (int i = 0; i < matriz.length; i++) {
            String line = "";
            for (int j = 0; j < matriz.length; j++) {
                line += matriz[j][i];
            }
            lines.put(i, line);
        }

        this.verticales = lines;
    }
}
