package com.mercadolibre.examen.demo.validador;

import org.springframework.stereotype.Component;

@Component
public class DownValidator {

    public int validate(String[][] matriz, int i, int j) {
        int abajoCount = 0;
        for (int k = i + 1; k < (i + 3 > matriz.length - i - 1 ? matriz.length - i - 1 : i + 4); k++) {
            if (matriz[k][j] != null && matriz[i][j].equals(matriz[k][j])) {
                abajoCount++;
            }
        }
        if (abajoCount > 2) {
            return 1;
        }
        return 0;
    }

}
