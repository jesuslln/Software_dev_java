package com.icai.practicas.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class DniTest {


    @Test
    public void ValidarCorrectamenteDNI(){

        // Given
            // correcto
        DNI dniCorrecto = new DNI("43532235C");

            // Incorrecto
        DNI dniSin9Caracteres = new DNI("44123456789K");
        DNI dniEspacios = new DNI("43 532 235 C");
        DNI dniSinLetra = new DNI("43287782");
        DNI dniLetraIncorrecta = new DNI("43532235G");

        // When
        boolean correcto = dniCorrecto.validar();

        boolean espacios = dniEspacios.validar();
        boolean sin9Caracteres = dniSin9Caracteres.validar();
        boolean sinLetra = dniSinLetra.validar();
        boolean letraIncorrecta = dniLetraIncorrecta.validar();

        // Then
        Assertions.assertEquals(true, correcto);

        Assertions.assertEquals(false, espacios);
        Assertions.assertEquals(false, sinLetra);
        Assertions.assertEquals(false, sin9Caracteres);
        Assertions.assertEquals(false, letraIncorrecta);
    
    }
    
}
