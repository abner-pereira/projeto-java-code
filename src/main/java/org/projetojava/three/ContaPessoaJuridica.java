package org.projetojava.three;

public class ContaPessoaJuridica extends Conta {
    private long noCNPJ;

    public ContaPessoaJuridica(int agencia, int conta, String noCNPJ) {
        super(agencia, conta);
        this.noCNPJ = Long.parseLong(noCNPJ);
    }

    //Sobreposição de Método (Polimorfismo)
    @Override
    public void addSaldo(double saldo) {
        final double txCusto = 20;
        final double percFinal = 1 - (txCusto / 100);
        super.addSaldo(saldo * percFinal);
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
