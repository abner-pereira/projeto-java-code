package org.projetojava.nine;

//Anotação Personalizada
@EDeveloper
public class Developer {
    private String nome;
    private Integer nivel;

    private Developer(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    //Anotação Personalizada
    @Autor(nome = "Alessandro", revision = 1)
    @Modificador({
            @Autor(nome = "Andrea", revision = 1),
            @Autor(nome = "Julia", revision = 2, data = "20/06/2023")
    })
    public static Developer factory(String nome, Integer nivel) {
        return new Developer(nome, nivel);
    }

    public String getNome() {
        return this.nome;
    }

    public String getNivelInfo() {
        if (this.nivel <= 3) {
            return "Júnior";
        } else {
            if (this.nivel <= 6) {
                return "Pleno";
            } else {
                return "Sênior";
            }
        }
    }
}