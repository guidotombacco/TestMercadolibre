package com.mercadolibre.examen.demo;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import com.mercadolibre.examen.demo.Service.XMenService;

@SpringBootTest
class MatrizTests {
    
    XMenService xMenService;
    String[] adn = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};

    @BeforeEach
    void setUp(){
        xMenService = new XMenService();
    }

    @Test
    void validateMatriz(){
        String[][] matriz = xMenService.processArray(adn);
        assertEquals(matriz.length, matriz[0].length);
    }

    @Test
    void validateWrite()

}
