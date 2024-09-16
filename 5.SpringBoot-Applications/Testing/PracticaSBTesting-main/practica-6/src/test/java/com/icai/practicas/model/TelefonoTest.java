package com.icai.practicas.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelefonoTest {
    




    //Primer Test
    @Test
    public void ValidarCorrectamenteTelefonos(){

        // Given 
            //Válido
        Telefono telefonoSin9Caracteres = new Telefono("649 03 2");
        Telefono telefonoConLetras = new Telefono("649 03 21 3a"); //sería lo mismo para el resto de caracteres
        Telefono telefonoEspacios = new Telefono("6 4 9 0 3 2 1 3 3");
        Telefono telefonoSinMas = new Telefono("34 649 03 21 33");
        Telefono telefonoCodigoErroneo = new Telefono("+1000 649 03 21 33");

            // Inválido
        Telefono telefonoCodigo1 = new Telefono("+1 649 03 21 33");
        Telefono telefonoCodigo2= new Telefono("+999 640 03 21 33"); // rango del 1 al 999
        Telefono telefonoCorrecto = new Telefono("649032133");
        Telefono telefonoCorrecto2 = new Telefono("649 03 21 33");
        Telefono telefonoCorrecto3 = new Telefono("649 032 133");
        Telefono telefonoInexistente = new Telefono("149 032 133"); // se acepta porque respeta el formato
                                                                    // habría que restringir el ranga del primer numero

        // When 
        boolean sin9Caracteres = telefonoSin9Caracteres.validar();
        boolean conLetras = telefonoConLetras.validar();            
        boolean espacios = telefonoEspacios.validar();        
        boolean sinMas = telefonoSinMas.validar();    
        boolean codigoErroneo = telefonoCodigoErroneo.validar();    
        
        boolean codigo1 = telefonoCodigo1.validar();        
        boolean codigo2 = telefonoCodigo2.validar();
        boolean correcto = telefonoCorrecto.validar();
        boolean correcto2 = telefonoCorrecto2.validar();
        boolean correcto3 = telefonoCorrecto3.validar();        
        boolean inexistente = telefonoInexistente.validar();

        // Then
        Assertions.assertEquals(false, sin9Caracteres);
        Assertions.assertEquals(false, conLetras);
        Assertions.assertEquals(false, espacios);
        Assertions.assertEquals(false, sinMas);
        Assertions.assertEquals(false, codigoErroneo);

        Assertions.assertEquals(true, correcto);
        Assertions.assertEquals(true, correcto2);
        Assertions.assertEquals(true, correcto3);
        Assertions.assertEquals(true, codigo1);
        Assertions.assertEquals(true, codigo2);
        Assertions.assertEquals(true, inexistente);

    }
}
