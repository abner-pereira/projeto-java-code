package org.projetojava.nine;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

//Documented - Obrigatório para a criação da Anotação
//Target - Aplicação da Anotação
@Documented
@Target(ElementType.METHOD)
public @interface Modificador {
    Autor[] value();
}