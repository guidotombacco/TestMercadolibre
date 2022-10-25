package com.mercadolibre.examen.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolibre.examen.demo.Repository.VerificadosRepository;
import com.mercadolibre.examen.demo.Utils.FormatADN;
import com.mercadolibre.examen.demo.validador.DiagonalValidator;
import com.mercadolibre.examen.demo.validador.DownValidator;
import com.mercadolibre.examen.demo.validador.RigthValidator;

@Service
public class XMenService {

    @Autowired
    DownValidator downValidator;

    @Autowired
    RigthValidator rigthValidator;

    @Autowired
    DiagonalValidator diagonalValidator;

    @Autowired
    VerificadosRepository verificadosRepository;

    @Autowired
    FormatADN formatADN;

    public String[][] processArray(String[] adn) {
        // TODO Auto-generated method stub

        String[][] matriz = new String[adn.length][adn.length];

        for (int i = 0; i < adn.length; i++) {
            String[] lineSplit = adn[i].split("");
            for (int j = 0; j < lineSplit.length; j++) {
                matriz[i][j] = lineSplit[j];
            }
        }
        return matriz;
    }

    public Boolean processADN(String[] adn) {
        String[][] matriz = processArray(adn);

        int countMutant = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                // Derecha
                countMutant += rigthValidator.validate(matriz, i, j);
                //diagonal
                countMutant += diagonalValidator.validate(matriz, i, j);
                // Abajo
                countMutant += downValidator.validate(matriz, i, j);
            }
        }
        System.out.println(countMutant);
        if (countMutant > 1) {
            System.out.println("true");
            verificadosRepository.save(formatADN.formatADN(matriz));
            return true;
        } else {
            return false;
        }
    }

}
