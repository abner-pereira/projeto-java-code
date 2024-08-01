package org.projetojava;

public class Main {
    public static void main(String[] args) {
        //Variável
        String nome = "Julio";
        Integer idade = 25;

        System.out.println("Nome: " + nome + ", Idade: " + idade);

        //Constante (SEMPRE em letra MAIÚSCULA - Boas Práticas)
        final Double MAX_NOTA = 10.0;
        final String CAPITAL = "Tóquio";

        System.out.println("Capital: " + CAPITAL + ", Nota Turismo: " + MAX_NOTA);

        //Tipos primitivos
        byte varByte = 120;
        short varShort = 12005;
        int varInt = 950234;
        long varLong = 19220443;
        float varFloat = 35.897f;
        double varDouble = 12356.50643;
        boolean varBoolean = true;
        char varChar = 'A';

        System.out.println("Dias corridos: " + varByte);
        System.out.println("Preço de Venda: R$ " + varDouble);

        //Wrapper Classes
        String varStringC = "Antônio Silva";
        varStringC = varStringC.toUpperCase();

        Integer varInterC = 15;
        String varIntStr = varInterC.toString().substring(1, 2);

        System.out.println("Nome Completo: " + varStringC);
        System.out.println("Posição 2 (15): " + varIntStr);

        //Operadores(+, -, /, *, %)
        int varNum1 = 10;
        int varNum2 = 30;
        int varNum3 = 50;

        System.out.println("Soma (" + varNum1 + "," + varNum2 + "): " + (varNum1 + varNum2));
        System.out.println("Modulo (" + varNum3 + "," + varNum2 + "): " + (varNum3 % varNum2));
        System.out.println("Multiplica (" + varNum1 + "," + varNum3 + "): " + (varNum1 * varNum3));

        //Operador Igualdade/Relacionamento(==, !=, >, >=, <, <=) e Lógico (&&, ||)
        boolean varNtBaixa = false;
        System.out.println("Aprovado (Sem Nt. Baixa)? " + !varNtBaixa);

        final double varCp1 = 10;
        final double varCp2 = 9.5;

        boolean varResp = varCp1 < varCp2;
        System.out.println("Comparativo 1 (" + varCp1 + " < " + varCp2 + "): " + varResp);

        final double varCp3 = 9.7;
        varResp = varCp2 <= varCp3 && varCp1 >= varCp3;
        System.out.println("Comparativo 2 (" + varCp3 + " BETWEEN " + varCp1 + " AND " + varCp2 + "): " + varResp);
    }
}