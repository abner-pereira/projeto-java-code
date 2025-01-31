package org.projetojava.three;

//Final -> NÃO permite a criação de Herança a partir da classe atual
public final class ContaPessoaFísica extends Conta {
    private long noCPF;

    public ContaPessoaFísica(int agencia, int conta, String noCPF) {
        super(agencia, conta);
        this.noCPF = Long.parseLong(noCPF);
    }

    //Sobreposição de Método (Polimorfismo)
    @Override
    public void addSaldo(double saldo) {
        final double txCusto = 15;
        final double percFinal = 1 - (txCusto / 100);
        super.addSaldo(saldo * percFinal);
    }

    //Final -> NÃO permite a sobreposição do método caso haja Herança
    public final String[] getDados() {
        String[] resDado = {
                Long.toString(this.noCPF),
                Integer.toString(this.conta),
                Integer.toString(this.agencia),
                Double.toString(this.saldo),
        };
        return resDado;
    }
}
