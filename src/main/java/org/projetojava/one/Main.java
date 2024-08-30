package org.projetojava.one;

import org.projetojava.three.*;
import org.projetojava.two.*;
import org.projetojava.four.*;

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

        //Condicional (IF, ELSE IF e ELSE)
        boolean varJogador1 = false;
        boolean varJogador2 = true;

        if (!varJogador1) {
            System.out.println("Jogador 1 habilitado: " + varJogador1);
        }

        if (varJogador1 == varJogador2) {
            //Faça algo
        } else {
            System.out.println("Jogador 1 e 2 diferentes: " + varJogador2);
        }

        //Switch
        int varStCivil = 3;

        switch (varStCivil) {
            case 1:
                System.out.println("Estado Civíl: Casado");
                break;
            case 2:
                System.out.println("Estado Civíl: Separado");
                break;
            case 3:
                System.out.println("Estado Civíl: Viúvo");
                break;
            default:
                System.out.println("Estado Civíl: Solteiro");
                break;
        }

        //Ternário
        char varSexo = 'M';
        String varDnSexual = varSexo == 'M' ? "Masculino" : "Feminino";

        System.out.println("Sexo Definido: " + varDnSexual);

        //Array simples
        String[] varPecas = {"Prato", "Colher", "Garfo", "Guarda-napo"};

        System.out.println("Itens para Comprar: " + varPecas[1] + " e " + varPecas[3]);

        //Array multidimensional
        String[][] varClientes = {
                {"A001", "Carlos Alvarenga"},
                {"A002", "Monica Santos"},
                {"C003", "Neide Mello"},
        };

        System.out.println("Cliente Premiado => ID: " + varClientes[2][0] + ", Nome: " + varClientes[2][1]);

        //Loops (While, Do-while e For)
        //While
        int varCount = 0;
        while (varCount < 2) {
            System.out.println("Dias Corridos: " + varCount);
            varCount++;
        }

        int[] varNmPrimo = {1, 2, 3, 5, 7};
        varCount = 0;
        while (varCount < varNmPrimo.length) {
            System.out.println("Número Primo => Posição: " + varCount + ", Valor: " + varNmPrimo[varCount]);
            varCount++;
        }

        //Do-while
        varCount = varNmPrimo.length;
        varCount--;
        do {
            System.out.println("Número Primo Invertido => Valor: " + varNmPrimo[varCount]);
            varCount--;
        } while (varCount >= 0);

        //For
        for (int idx = 0; idx < varNmPrimo.length; idx++) {
            varCount = 0;
            varCount = varNmPrimo[idx] % 2;

            if (varCount != 0) {
                System.out.println("Número Primo Ímpar => Valor: " + varNmPrimo[idx]);
            }
        }

        //Objeto e Classe
        Jogador playerOne = new Jogador();
        playerOne.setName("Alura Now");
        playerOne.addPontuacao(10);

        Jogador playerTwo = new Jogador();
        playerTwo.setName("Rocketseat");
        playerTwo.addPontuacao(15);

        System.out.println("Player 1 => Nome: " + playerOne.getNome() + ", Pontos: " + playerOne.getPontuacao());
        System.out.println("Player 2 => Nome: " + playerTwo.getNome() + ", Pontos: " + playerTwo.getPontuacao());

        //Construtor/Sobrecarga de Construtor
        Jogador playerThree = new Jogador("Codans", 18);
        Jogador playerFour = new Jogador("Congenial", 20);

        System.out.println("Player 3 Convidado => Nome: " + playerThree.getNome());
        System.out.println("Player 4 Convidado => Nome: " + playerFour.getNome());

        //Sobrecarga de Método
        String propPlayerOne = playerOne.getPropriedade();
        System.out.println("Player 1 Propriedade => \"Full\": " + propPlayerOne);

        String propPlayerTwo = playerTwo.getPropriedade("NOME");
        System.out.println("Player 2 Propriedade => \"Nome\": " + propPlayerTwo);

        //Modificadores de Acesso - Visibilidade
        Jogador jogOne = new Jogador();
        Jogador jogTwo = new Jogador();

        jogOne.addPontuacao(10);
        jogTwo.addPontuacao(15);

        Partida partidaOne = new Partida(jogOne, jogTwo);
        //Obs.: Não é possível acessar os atributos e métodos do tipo "package-private"

        //Herança
        ContaPessoaFísica ctFisica = new ContaPessoaFísica(6001, 202035, "77777777777");
        ContaPessoaJuridica ctJuridica = new ContaPessoaJuridica(6002, 303155, "99999999999999");

        //Polimorfismo
        ctFisica.addSaldo(1000.50);
        ctJuridica.addSaldo(2075.50);

        String[] ctFisicaDado = ctFisica.getDados();
        String[] ctJuridicaDado = ctJuridica.getDados();

        System.out.println("Conta Física => CPF: " + ctFisicaDado[0] + "; Saldo: " + ctFisicaDado[3]);
        System.out.println("Conta Jurídica => CNPJ: " + ctJuridicaDado[0] + "; Saldo: " + ctJuridicaDado[3]);

        //Classe Abstrata vs Classe Concreta
        //Classe Abstrata --> Não pode ser instanciada
        //Animal genAnimal = new Animal("Gato");       //Error
        Manifero aniHomem = new Manifero("Ser Humano", 3);
        Manifero aniCanguru = new Manifero("Canguru", 1);
        Manifero aniEquidna = new Manifero("Equidna", 0);

        //Interface
        System.out.println("Manifero 1 => " + aniHomem.showDado());
        System.out.println("Manifero 2 => " + aniCanguru.showDado());
        System.out.println("Manifero 3 => " + aniEquidna.showDado());
    }
}