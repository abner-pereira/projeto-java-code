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

    //Sobreposição (Object)
    @Override
    public String toString() {
        return String.format("%s|%s", this.classif, this.getNome());
    }

    //Sobreposição (Object)
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Manifero) {
            if (this.toString().equals(obj.toString())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    //Sobreposição (Object)
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
}