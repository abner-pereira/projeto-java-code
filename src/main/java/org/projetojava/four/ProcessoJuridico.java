package org.projetojava.four;

public class ProcessoJuridico implements Processo {
    private String numProcesso;
    private int cnpj;

    private ProcessoJuridico(String numProcesso, int cnpj) {
        this.numProcesso = numProcesso;
        this.cnpj = cnpj;
    }

    public static Processo factory(String numProcesso, int cnpj) {
        return new ProcessoJuridico(numProcesso, cnpj);
    }

    @Override
    public String getInfo() {
        return "Nr. Processo: " + this.numProcesso + ", CNPJ: " + this.cnpj;
    }
}
