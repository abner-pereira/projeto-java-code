package org.projetojava.nine;

import java.lang.annotation.*;

//Documented - Obrigatório para a criação da Anotação
//Target - Aplicação da Anotação
@Documented
@Target(ElementType.METHOD)
public @interface Autor {
    String nome();

    int revision() default 0;

    String data() default "25/02/2023";
}
