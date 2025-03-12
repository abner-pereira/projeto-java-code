package org.projetojava.four;

public class ProcessoFisico implements Processo {
    private String numProcesso;
    private int cpf;

    private ProcessoFisico(String numProcesso, int cpf) {
        this.numProcesso = numProcesso;
        this.cpf = cpf;
    }

    public static Processo factory(String numProcesso, int cpf) {
        return new ProcessoFisico(numProcesso, cpf);
    }

    @Override
    public String getInfo() {
        return "Nr. Processo: " + this.numProcesso + ", CPF: " + this.cpf;
    }
}