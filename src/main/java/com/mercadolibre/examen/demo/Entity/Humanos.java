package com.mercadolibre.examen.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Humanos")
@Getter
@Setter
@NoArgsConstructor
public class Humanos {
    
    private static final long serialVerionUID = 1L;

    @Id
    @Column(name="ADN")
    public String adn;

}
