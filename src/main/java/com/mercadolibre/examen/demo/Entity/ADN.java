package com.mercadolibre.examen.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Verificados")
@Getter 
@Setter
@NoArgsConstructor
public class ADN {
    
    private static final long serialVerionUID = 1L;

    @Column(name="ADN")
    public String adn;
}
