package com.mercadolibre.examen.demo.Model;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Horizontales {
    
    public HashMap<Integer, String> horizontales;

    public void setHorizontales(String[][] matriz){
        HashMap<Integer, String> lines = new HashMap<Integer, String>();
        for (int i = 0; i < matriz.length; i++) {
            String line = "";
            for (int j = 0; j < matriz[i].length; j++) {
                line += matriz[i][j];
            }
            lines.put(i, line);
        }
        this.horizontales = lines;
    }

}
