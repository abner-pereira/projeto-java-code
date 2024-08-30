package org.projetojava.four;

//Classe Concreta com Aplicação de Interface
public class Manifero extends Animal implements Exibicao {
    String classif;

    public Manifero(String nome, int classif) {
        super(nome);

        switch (classif) {
            case 0:
                this.classif = "Monotremados";
                break;
            case 1:
                this.classif = "Marsupiais";
                break;
            default:
                this.classif = "Eutérios";
                break;
        }
    }

    //Sobreposição (Interface)
    @Override
    public String showDado() {
        return "Info Animal: " + this.getNome() + " - " + this.classif;
    }
}