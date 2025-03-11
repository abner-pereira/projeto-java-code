package org.projetojava.four;

public interface Aeronave {
    public void setTipoCombustivel(Aeronave.Combustivel tipoCombustivel);

    //STATIC -> Utilização semelhante a Classe para Método e Enum
    static enum Combustivel {
        DISEL("Disel"), ETANOL("Etanol"), OLEO("Óleo"), GASOLINA("Gasolina");

        final String descEnum;

        Combustivel(String descEnum) {
            this.descEnum = descEnum;
        }

        public String getDesc() {
            return descEnum;
        }
    }
}