package com.mercadolibre.examen.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mercadolibre.examen.demo.Model.Stats;
import com.mercadolibre.examen.demo.Repository.HumanosRepository;
import com.mercadolibre.examen.demo.Repository.VerificadosRepository;

@Service
public class StatsService implements IStatsService {

    @Autowired
    HumanosRepository humanosRepository;

    @Autowired
    VerificadosRepository verificadosRepository;

    @Override
    public Stats getStats() {
        // TODO Auto-generated method stub
        
        Stats stats = new Stats();
        stats.setCount_human_dna(humanosRepository.count());
        stats.setCount_mutan_dna(verificadosRepository.count());
        stats.setRatio(stats.getCount_mutan_dna()/stats.getCount_human_dna());

        return stats;
    }
    
}
