package com.mercadolibre.examen.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolibre.examen.demo.Exceptions.HumanException;
import com.mercadolibre.examen.demo.Model.Diagonales;
import com.mercadolibre.examen.demo.Model.Horizontales;
import com.mercadolibre.examen.demo.Model.Verticales;
import com.mercadolibre.examen.demo.Repository.HumanosRepository;
import com.mercadolibre.examen.demo.Repository.VerificadosRepository;
import com.mercadolibre.examen.demo.Utils.FormatADNHumanos;
import com.mercadolibre.examen.demo.Utils.FormatADNMutantes;
import com.mercadolibre.examen.demo.validador.DiagonalValidator;
import com.mercadolibre.examen.demo.validador.DownValidator;
import com.mercadolibre.examen.demo.validador.RigthValidator;

@Service
public class XMenService implements IXMenService {

    @Autowired
    DownValidator downValidator;

    @Autowired
    RigthValidator rigthValidator;

    @Autowired
    DiagonalValidator diagonalValidator;

    @Autowired
    private VerificadosRepository verificadosRepository;

    @Autowired
    private HumanosRepository humanosRepository;

    @Autowired
    FormatADNMutantes formatADNMutantes;

    @Autowired
    FormatADNHumanos formatADNHumanos;

    @Override
    public String[][] processArray(String[] adn) {

        String[][] matriz = new String[adn.length][adn.length];

        for (int i = 0; i < adn.length; i++) {
            String[] lineSplit = adn[i].split("");
            for (int j = 0; j < lineSplit.length; j++) {
                matriz[i][j] = lineSplit[j];
            }
        }
        return matriz;
    }

    @Override
    public Boolean processADN(String[] adn) {
        String[][] matriz = processArray(adn);
        Integer countMutant = 0;
        Diagonales diagonales = new Diagonales();
        Horizontales horizontales = new Horizontales();
        Verticales verticales = new Verticales();

        diagonales.setDiagonales(matriz);
        horizontales.setHorizontales(matriz);
        verticales.setVerticales(matriz);
        // Derecha
        countMutant += rigthValidator.validate(horizontales.getHorizontales());
        // diagonal
        countMutant += diagonalValidator.validate(diagonales.getDiagonals());
        // Abajo
        countMutant += downValidator.validate(verticales.getVerticales());
        if (countMutant > 1) {
            verificadosRepository.save(formatADNMutantes.formatADN(matriz));
            return true;
        } else {
            humanosRepository.save(formatADNHumanos.formatADN(matriz));
            throw new HumanException();
        }
    }

}
