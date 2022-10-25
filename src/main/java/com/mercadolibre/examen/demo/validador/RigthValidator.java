package com.mercadolibre.examen.demo.validador;

import org.springframework.stereotype.Component;

@Component
public class RigthValidator {

    public int validate(String[][] matriz, int i, int j) {
        int derechaCount = 0;
        for (int k = j + 1; k < (j + 3 > matriz[i].length - j - 1 ? matriz[i].length - j - 1 : j + 4); k++) {
            if (matriz[i][k] != null && matriz[i][j].equals(matriz[i][k])) {
                derechaCount++;
            }
        }
        if (derechaCount > 2) {
            return 1;
        }
        return 0;
    }

}
