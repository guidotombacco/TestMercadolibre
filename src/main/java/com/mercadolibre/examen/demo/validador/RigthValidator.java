package com.mercadolibre.examen.demo.validador;

import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class RigthValidator {

    private Integer mutanCounter;

    public int validate(HashMap<Integer, String> horizontales) {
        mutanCounter = 0;
        horizontales.forEach((id, value) -> {
            String[] letters = value.split("");
            int count = 0;
            for (int i = 1; i < letters.length; i++) {
                if (letters[i - 1].equals(letters[i])) {
                    count++;
                }else{
                    count = 0;
                }
                if (count >= 3) {
                    mutanCounter++;
                }
            }
        });
        return mutanCounter;
    }

}
