package org.projetojava.four;

//Classe Concreta -> Possui e Implementa Interface(s)
public class Manifero extends Animal {
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
        String txtFormato = getModelInfo();
        return String.format(txtFormato, this.getNome(), this.classif);
    }

    //Sobreposição (Abstract Class)
    @Override
    protected String getModelInfo() {
        return "Info Animal: %s - %s";
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