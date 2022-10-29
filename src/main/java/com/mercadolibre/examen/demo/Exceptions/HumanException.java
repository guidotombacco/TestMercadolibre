package com.mercadolibre.examen.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serials")

@ResponseStatus(code = HttpStatus.FORBIDDEN)
public class HumanException extends RuntimeException {
    
    public HumanException(){
        super();
    }

}
