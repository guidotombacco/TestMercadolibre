package com.mercadolibre.examen.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolibre.examen.demo.Model.Stats;
import com.mercadolibre.examen.demo.Repository.HumanosRepository;
import com.mercadolibre.examen.demo.Repository.VerificadosRepository;
import com.mercadolibre.examen.demo.Utils.GCD;

@Service
public class StatsService implements IStatsService {

    @Autowired
    HumanosRepository humanosRepository;

    @Autowired
    VerificadosRepository verificadosRepository;

    @Autowired
    GCD gcd;

    @Override
    public Stats getStats() {
        // TODO Auto-generated method stub
        
        Stats stats = new Stats();
        stats.setCount_human_dna(humanosRepository.count());
        stats.setCount_mutan_dna(verificadosRepository.count());
        if (stats.getCount_human_dna() > 0) {
            System.out.println(Double.valueOf(Long.toString(stats.getCount_mutan_dna()))/Double.valueOf(Long.toString(stats.getCount_mutan_dna())));
            Double porcentaje = Double.valueOf(Long.toString(stats.getCount_mutan_dna()))/Double.valueOf(Long.toString(stats.getCount_mutan_dna()));
            stats.setRatio(porcentaje);   
        } else {
            stats.setRatio(0.0);
        }

        return stats;
    }
    
}
