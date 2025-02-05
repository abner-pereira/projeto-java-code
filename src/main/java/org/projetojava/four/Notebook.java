package org.projetojava.four;

//Classe Concreta -> Possui e Implementa Interface(s)
public class Notebook extends Computador {
    public Notebook(Integer numNucleo) {
        super(numNucleo);
        Computador.setInstObj();
    }

    //Sobreposição (Interface)
    @Override
    public String getQuantNucleo() {
        final String TXT_FORMAT = "Quantidade de Núcleos: %s%n";

        return String.format(
                TXT_FORMAT,
                switch (numNucleo) {
                    case 1:
                        yield "Single Core";
                    case 2:
                        yield "Dual Core";
                    case 4:
                        yield "Quad Core";
                    case 6:
                        yield "Six Core";
                    case 8:
                        yield "Octa Core";
                    default:
                        yield "Multi Core";
                }
        );
    }
}