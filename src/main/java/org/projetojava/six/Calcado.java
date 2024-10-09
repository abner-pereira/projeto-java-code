package org.projetojava.six;

public record Calcado(Tipo tipo, String marca, String modelo, int tamanho) {
    public enum Tipo {
        TENIS("Tênis"), SAPATO("Sapato"), SANDALIA("Sandália");

        private final String descTipo;

        Tipo(String descTipo) {
            this.descTipo = descTipo;
        }

        public String getDescTipo() {
            return this.descTipo;
        }
    }

    //Compact Constructor -> SEM Parenteses
    public Calcado {
        try {
            if (tamanho == 0) {
                throw new Exception("Tamanho não definido!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //-> ATRIBUIÇÃO AUTOMÁTICA
        //this.tipo = tipo;
        //this.marca = marca;
        //this.modelo = modelo;
        //this.tamanho = tamanho;
    }

    /*
    //Canonical Constructor -> COM Parenteses
    public Sapato(String marca, String modelo, int tamanho) {
        try {
            if (marca.equals("")) {
                throw new Exception("Marca não definido!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //-> ATRIBUIÇÃO MANUAL
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
    }
    */

    public void getDetalhes() {
        System.out.println(
                "Calçado => Tipo: " + this.tipo.descTipo +
                        ", Marca: " + this.marca() +
                        ", Modelo: " + this.modelo());
    }
}
