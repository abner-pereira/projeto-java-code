package org.projetojava.five;

public class Operacao {
    static int ID = -1;

    //Bloco Estático inicializável -> Carregado na Primeira execução
    static {
        setID();
    }

    //SEM Construtor
    //É gerado um construtor genérico, herdado da super classe OBJECT

    public static int getID() {
        return ID;
    }

    public static void setID() {
        ID++;
    }

    public static Operacao factory() {
        return new Operacao();
    }

    public double executaOperacao(double var1, double var2, char ope) {
        setID();
        return
                switch (ope) {
                    case '+' -> var1 + var2;
                    case '-' -> var1 - var2;
                    case '/' -> var1 / var2;
                    case '*' -> var1 * var2;
                    default -> 0;
                };
    }
}
