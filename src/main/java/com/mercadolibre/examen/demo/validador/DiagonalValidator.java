package com.mercadolibre.examen.demo.validador;

import org.springframework.stereotype.Component;

@Component
public class DiagonalValidator {

    public int validate(String[][] matriz, int i, int j) {
        int diagonalCount = 0;
        for (int k = i + 1; k < (i + 3 > matriz.length - i - 1 ? matriz.length - i - 1 : i + 4); k++) {
            for (int k2 = j + 1; k2 < (j + 3 > matriz[i].length - j - 1 ? matriz[i].length - j - 1 : j + 4); k2++) {
                if (matriz[i][k] != null && matriz[i][j].equals(matriz[i][k])) {
                    diagonalCount++;
                }
            }
        }
        if (diagonalCount > 2) {
            return 1;
        }
        return 0;
    }
}
