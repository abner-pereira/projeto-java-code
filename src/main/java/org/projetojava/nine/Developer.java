package org.projetojava.nine;

@EDeveloper
public class Developer {
    private String nome;
    private Integer nivel;

    private Developer(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    @Autor(
            nome = "Carlos",
            revision = 1
    )
    public static Developer factory(String nome, Integer nivel) {
        return new Developer(nome, nivel);
    }
}