package org.projetojava.nine;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;

//Documented - Obrigatório para a criação da Anotação
//Repeatable - Definição de Repetição de Anotação
@Documented
@Repeatable(Modificador.class)
public @interface Autor {
    String nome();

    int revision() default 0;

    String data() default "25/02/2023";
}
