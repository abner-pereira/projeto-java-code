package org.projetojava.three;

public class ContaPessoaJuridica extends Conta {
    private long noCNPJ;

    public ContaPessoaJuridica(int agencia, int conta, String noCNPJ) {
        super(agencia, conta);
        this.noCNPJ = Long.parseLong(noCNPJ);
    }

    public String[] getDados() {
        String[] resDado = {
                Long.toString(this.noCNPJ),
                Integer.toString(this.conta),
                Integer.toString(this.agencia),
                Double.toString(this.saldo),
        };
        return resDado;
    }
}
