package org.projetojava.five;

//Enum COMPLEXO - COM Corpo
enum Meses {
    //Semelhante a um ARRAY (posições/indíce de 0...N)
    JAN("Janeiro"), FEV("Fevereiro"), MAR("Março"), ABR("Abril"),
    MAI("Maio"), JUN("Junho"), JUL("Julho"), AGO("Agosto"),
    SET("Setembro"), OUT("Outubro"), NOV("Novembro"), DEZ("Dezembro");

    private final String descricao;

    //Construtor -> Recebe o valor chamado acima
    Meses(String nome) {
        this.descricao = nome;
    }

    public String getDescrocao() {
        return this.descricao;
    }
}
