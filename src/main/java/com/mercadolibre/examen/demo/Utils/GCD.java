package com.mercadolibre.examen.demo.Utils;

import org.springframework.stereotype.Component;

@Component
public class GCD {
    
    public int getRatio(int i, int b){
        if (b == 0)
            return i;
        return getRatio(b, i % b);
    } 

}
