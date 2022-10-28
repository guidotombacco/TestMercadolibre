package com.mercadolibre.examen.demo.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Diagonales {

    public HashMap<Integer, String> diagonals;

    private Integer index;

    public void setDiagonales(String[][] matriz) {
        index = 0;
        HashMap<Integer, String> elements = new HashMap<Integer, String>();
        Integer numberDiagonal = (matriz.length - 3) * 2 + (matriz.length - 4) * 2;
        while (elements.size() * 2 < numberDiagonal) {
            for (int i = 0; i < matriz.length - 3; i++) {
                if (i == 0) {
                    elements = setDiagonal(matriz, elements);
                } else {
                    elements = setDoubleDiagonal(matriz, i, elements);
                }
            }
        }
        this.diagonals = elements;
    }

    private HashMap<Integer, String> setDiagonal(String[][] matriz, HashMap<Integer, String> elements) {
        String line = "";
        for (int j = 0; j < matriz.length; j++) {
            line += matriz[j][j];
        }
        elements.put(index++, line);
        return elements;
    }

    private HashMap<Integer, String> setDoubleDiagonal(String[][] matriz, int i, HashMap<Integer, String> elments) {
        int count = i;
        String line1 = "";
        String line2 = "";
        String line3 = "";
        String line4 = "";

        for (int j = 0; j < matriz.length; j++) {
            line1 += matriz[count][j];
            line2 += matriz[j][count];
            line3 += matriz[matriz.length - 2 - j][j];
            line4 += matriz[matriz.length -1 - j][j + 1];
            count++;
            if (count > matriz.length - 1) {
                break;
            }
        }
        elments.put(index++, line1);
        elments.put(index++, line2);
        elments.put(index++, line3);
        elments.put(index++, line4);
        return elments;
    }

}
