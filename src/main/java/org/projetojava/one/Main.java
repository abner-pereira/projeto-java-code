package org.projetojava.one;

import org.projetojava.android.*;
import org.projetojava.three.*;
import org.projetojava.two.*;
import org.projetojava.four.*;
import org.projetojava.five.*;
import org.projetojava.six.*;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        //Estudos/Exercícios Curso de Android
        cursoAndroid();
        //Estudo com base na Documentação
        estudoDocumentacao();
    }

    public static void cursoAndroid() {
        //Exercicios Curso Android
        Carro carroA = new Carro("BMW 320i", 4);
        Carro carroB = new Carro("Toyota Hilux SR", 4);

        carroA.acelerar();
        carroB.acelerar(5);

        Moto motoA = new Moto("CG 150", 2);
        Moto motoB = new Moto("Honda Biz", 2);

        motoA.acelerar();
        motoB.acelerar(10);
    }

    public static void estudoDocumentacao() {
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

        //Literais (Integer e Float)
        int varHexa = 0x1a;      //Prefixo 0x
        int varBinary = 0b1111;  //Prefixo 0b
        float varUnders = 10_457.34_9f;

        System.out.println("Hexadecimal: 0x1a => " + varHexa);
        System.out.println("Binário: 0b1111 => " + varBinary);
        System.out.println("Underscore: 10_457.34_9f => " + varUnders);

        //Literais (Char e String)
        char varCharQ = 'D';           //Aspas simples
        String varStringQ = "Letra D"; //Aspas duplas
        String varStringT = "Letras\tdo\tAlfabeto => \"A-Z\"";

        System.out.println(varStringT);

        //Array simples
        String[] varPecas = {"Prato", "Colher", "Garfo", "Guarda-napo"};

        String[] varPecasRev = new String[4]; //Mesmo tamanho acima
        varPecasRev[0] = "Guarda-napo";
        varPecasRev[1] = "Garfo";
        varPecasRev[2] = "Colher";
        varPecasRev[3] = "Prato";

        System.out.println("Itens para Comprar: " + varPecas[1] + " e " + varPecasRev[1]);

        //Array multidimensional
        String[][] varClientes = {
                {"A001", "Carlos Alvarenga"},
                {"A002", "Monica Santos"},
                {"C003", "Neide Mello"},
        };

        String[][] varClientesRev = new String[3][2];
        varClientesRev[0] = varClientesRev[2];
        varClientesRev[1] = varClientesRev[0];
        varClientesRev[2] = varClientesRev[1];

        System.out.println("Cliente Premiado => ID: " + varClientes[2][0] + ", Nome: " + varClientes[2][1]);

        //Array Manipulação
        char[] varAlfa = {'A', 'B', 'C', 'D', 'E'};
        char[] varAlfaPlus = {'F', 'G', 'H'};
        char[] varAlfaSix = new char[6];

        //Copiando Array (Classe System)
        System.arraycopy(varAlfa, 2, varAlfaSix, 0, 3);
        System.arraycopy(varAlfaPlus, 0, varAlfaSix, 3, 3);

        String varStrAlfa = "";
        for (char letra : varAlfaSix) {
            varStrAlfa += letra + "\t";
        }

        System.out.println("Letras Escolhidas: " + varStrAlfa);

        //Métodos Estáticos da Classe Arrays
        //Busca
        int varPos = java.util.Arrays.binarySearch(varAlfaSix, 'G');

        System.out.println("Letra Encontrada: " +
                (varPos < 0 ? "Error" : varAlfaSix[varPos]));

        //Cópia
        char[] varAlfaTen = java.util.Arrays.copyOf(varAlfaSix, 10);
        varAlfaTen[6] = 'M';
        varAlfaTen[7] = 'L';
        varAlfaTen[8] = 'N';
        varAlfaTen[9] = 'A';

        //Conversão para String
        String varElemTen = java.util.Arrays.toString(varAlfaTen);

        System.out.println("Novas Letras: " + varElemTen);

        //Ordenação
        java.util.Arrays.sort(varAlfaTen);
        varElemTen = java.util.Arrays.toString(varAlfaTen);

        System.out.println("Novas Letras Ordenadas: " + varElemTen);

        //VAR - Variaveis locais (Sem Tipagem)
        var nomeCompleto = nome + " Santos";
        var anoNasc = java.time.Year.now().getValue() - idade;

        System.out.println("Nome Completo: " + nomeCompleto + ", Ano Nascimento: " + anoNasc);

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

        final double VAR_CP1 = 10;
        final double VAR_CP2 = 9.5;

        boolean varResp = VAR_CP1 < VAR_CP2;
        System.out.println("Comparativo 1 (" + VAR_CP1 + " < " + VAR_CP2 + "): " + varResp);

        final double VAR_CP3 = 9.7;
        varResp = VAR_CP2 <= VAR_CP3 && VAR_CP1 >= VAR_CP3;
        System.out.println("Comparativo 2 (" + VAR_CP3 + " BETWEEN " + VAR_CP1 + " AND " + VAR_CP2 + "): " + varResp);

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
        final int ST_CIVIL = 3;

        switch (ST_CIVIL) {
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

        final int MES = 5;
        //NÃO é uma BOA PRÁTICA
        switch (MES) {
            case 1:
            case 2:
            case 3:
                System.out.println("Trimestre: Primeiro");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Trimestre: Segundo");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Trimestre: Terceiro");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Trimestre: Quarto");
                break;
            default:
                break;
        }

        //Switch (Com retorno -> YIELD)
        final int ANO = 2000;
        final int ANO_BI = ANO % 4;

        String varAnoBiTxt =
                switch (ANO_BI) {
                    case 0:
                        yield "Bissexto";
                    default:
                        yield "Comum";
                };

        System.out.println("Info Ano: " + ANO + " - " + varAnoBiTxt);

        //Switch (Expressão)
        switch (MES) {
            case 1, 2, 3 -> {
                System.out.println("Período Trimestral: JAN a MAR");
            }
            case 4, 5, 6 -> {
                System.out.println("Período Trimestral: ABR a JUN");
            }
            case 7, 8, 9 -> System.out.println("Período Trimestral: JUL a SET");
            case 10, 11, 12 -> System.out.println("Período Trimestral: OUT a DEZ");
        }

        //Switch (Expressão com retorno -> COM ou SEM YIELD)
        String varMesDesc =
                switch (MES) {
                    case 1 -> {
                        yield "JAN"; //Retorna através do YIELD
                    }
                    case 2 -> {
                        yield "FEV";
                    }
                    case 3 -> {
                        yield "MAR";
                    }
                    case 4 -> {
                        yield "ABR";
                    }
                    case 5 -> {
                        yield "MAI";
                    }
                    case 6 -> {
                        yield "JUN";
                    }
                    case 7 -> "JUL";  //Retorna diretamente
                    case 8 -> "AGO";
                    case 9 -> "SET";
                    case 10 -> "OUT";
                    case 11 -> "NOV";
                    case 12 -> "DEZ";
                    default -> "NULL";
                };

        System.out.println("Mês Descritivo: " + varMesDesc);

        //Ternário
        char varSexo = 'M';
        String varDnSexual = varSexo == 'M' ? "Masculino" : "Feminino";

        System.out.println("Sexo Definido: " + varDnSexual);

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

        //For -> Enhanced
        var idxRacional = 0;
        double[] varNmRacional = new double[3];
        varNmRacional[0] = 0.2;
        varNmRacional[1] = 0.06;
        varNmRacional[2] = 0.0045;

        for (double nmRacional : varNmRacional) {
            idxRacional++;
            System.out.println("NÚmero Racional => Posição: " + idxRacional + ", Valor: " + nmRacional);
        }

        //Break (For, While ou Do-While)
        final int BASE_VALOR = 18;
        final int BASE_MULTIPLICACAO = 5;
        for (; ; ) { //Loop infinito
            System.out.println("Tabuada Multiplicação => " + BASE_VALOR + " x " + BASE_MULTIPLICACAO + " = "
                    + (BASE_VALOR * BASE_MULTIPLICACAO));
            break;
        }

        final int BASE_DIVISAO = 3;
        while (true) { //Loop infinito
            System.out.println("Tabuada Divisão => " + BASE_VALOR + " / " + BASE_DIVISAO + " = " +
                    (BASE_VALOR / BASE_DIVISAO));
            break;
        }

        final int BASE_ADICAO = 5;
        do { //Loop infinito
            System.out.println("Tabuada Adição => " + BASE_VALOR + " + " + BASE_ADICAO + " = " +
                    (BASE_VALOR + BASE_ADICAO));
            break;
        } while (true);

        //Break Nomeado (For, While ou Do-While)
        labelStop:
        do { //Loop infinito
            while (true) { //Loop infinito
                for (; ; ) { //Loop infinito
                    System.out.println("Estudos => Status: \"Ativo\"");
                    break labelStop;
                }
            }
        } while (true);

        //Continue (For, While ou Do-While)
        String[][] varLetterGrp = new String[3][2];
        varLetterGrp[0][0] = "A";
        varLetterGrp[0][1] = "B";
        varLetterGrp[1][0] = "C";
        varLetterGrp[1][1] = "D";
        varLetterGrp[2][0] = "E";
        varLetterGrp[2][1] = "F";

        for (String[] letterGrp : varLetterGrp) {
            //IF sem {} é possível MAS com cuidado
            if (letterGrp[0] != "A")
                continue;

            System.out.println("Conjunto A1 => " + java.util.Arrays.toString(letterGrp));
        }

        int idxLetterGrp = varLetterGrp.length;
        while (idxLetterGrp >= 0) {
            idxLetterGrp--;
            //IF sem {} é possível MAS com cuidado
            if (idxLetterGrp < 0)
                continue;

            if (varLetterGrp[idxLetterGrp][0] != "C")
                continue;

            System.out.println("Conjunto A2 => " + java.util.Arrays.toString(varLetterGrp[idxLetterGrp]));
        }

        idxLetterGrp = varLetterGrp.length;
        do {
            idxLetterGrp--;
            //IF sem {} é possível MAS com cuidado
            if (idxLetterGrp < 0)
                continue;

            if (varLetterGrp[idxLetterGrp][0] != "E")
                continue;

            System.out.println("Conjunto A3 => " + java.util.Arrays.toString(varLetterGrp[idxLetterGrp]));
        } while (idxLetterGrp >= 0);

        //Continue Nomeado (For, While ou Do-While)
        idxLetterGrp = varLetterGrp.length;
        labelContinue:
        do {
            idxLetterGrp--;
            //IF sem {} é possível MAS com cuidado
            if (idxLetterGrp < 0)
                continue labelContinue;

            for (String letter : varLetterGrp[idxLetterGrp]) {
                if (letter == "C") {
                    System.out.println("Letra Subconjunto Sorteada: " + letter);
                    continue labelContinue;
                }
            }
        } while (idxLetterGrp >= 0);

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

        //Static (Field and Method)
        for (int idxStatic = 0; idxStatic <= 1; idxStatic++) {
            Operacao.setID();
            System.out.println("Estático Construtor => ID: " + Operacao.getID());
        }

        System.out.println(
                "Estático Operação => Multiplicação (Resultado): " +
                        Operacao.factory().executaOperacao(3, 4, '*') +
                        ", ID: " + Operacao.getID()
        );

        //Multi-argumentos
        Numero sorteio = new Numero(15, 34, 26, 33, 56, 44, 2);
        sorteio.sortDados();
        sorteio.showDados();

        //Nested Classes (Classes Aninhadas)
        Niveis niveis = new Niveis();
        niveis.showNivel();
        niveis.showNivelStatic();
        niveis.showNivelLocal();
        niveis.showNivelAnonimo();

        //Enums (Constants Groups)
        Mes.getMesDescr(Mes.MesesNum.MAR);
        Mes.getMesDescr(Mes.MesesNum.SET);

        //Record (Model Immutable Data)
        Calcado tenis = new Calcado(Calcado.Tipo.TENIS, "Nike", "Gols", 35);
        Calcado sapato = new Calcado(Calcado.Tipo.SAPATO, "Romam", "Luxx", 42);

        tenis.getDetalhes();
        sapato.getDetalhes();

        //Wrapper Classes
        String varStringC = "Antônio Silva";
        varStringC = varStringC.toUpperCase();

        System.out.println("Wrapper => Nome Completo: " + varStringC);

        Integer varInterC = Integer.valueOf(15);
        String varIntStr = varInterC.toString().substring(1, 2);

        System.out.println("Wrapper => Posição 2 (15): " + varIntStr);

        Character varCharC = Character.valueOf('a');
        String varCharStr = varCharC.toString().toUpperCase();

        System.out.println("Wrapper => Carro com a Letra: " + varCharStr);

        //Printf e Format (% - java.util.Formatter)
        char[] nomeCEO = {'P', 'e', 'd', 'r', 'o'};

        System.out.printf("Format => Apresentação: \'Seu nome é %s. Ele tem %d anos de experiência\'%n",
                String.valueOf(nomeCEO),
                Integer.valueOf("18"));

        System.out.printf("Format => Nº Sorteado: %010d%n",
                Integer.valueOf("654321"));

        System.out.format("Format => CPF do Soteado: %011d%n",
                Integer.valueOf("1234567"));

        System.out.printf("Format => Horário do Sorteiro: %tH:%tM%n",
                System.currentTimeMillis(),
                System.currentTimeMillis());

        System.out.format("Format => Dia do Sorteiro: %td de %tB de %tY%n",
                System.currentTimeMillis(),
                System.currentTimeMillis(),
                System.currentTimeMillis());

        //DecimalFormat
        DecimalFormat fmtNum = (DecimalFormat) DecimalFormat.getInstance();
        fmtNum.applyPattern("00000");

        System.out.printf("Format => Nº Serviço: %s%n",
                fmtNum.format(Integer.valueOf("185")));

        fmtNum.applyPattern("###%");

        System.out.format("Format => Percentual de Prêmios: %s%n",
                fmtNum.format(Float.valueOf("0.25f")));

        System.out.printf("Format => Conversão Númerica: %.1f%n",
                Math.abs(Float.valueOf("-15.89f")
                        .floatValue()));

        //Escape Sequence (\t, \b, \n, \r, \f, \', \", \\)
        String strEscape = "Conforme diz o ditado:\n\t\"O hábito faz o monge\";\r" +
                "\n\t\"Para bom entendedor, meia palavra basta\";\r" +
                "\n\t\"Deus ajuda quem cedo madruga\".\r";

        System.out.print("Escape => " + strEscape);

        //String Format
        String strFormat = String.format("Todos diziam:%n\t\"O menino cresceu..." +
                        "já não é mais como uma criança\"\r" +
                        "%n\t\"...completou %d anos\"\r",
                Integer.valueOf("18").intValue());

        System.out.println("String Format => " + strFormat);

        //Strings -> Numbers
        String numStrN1 = "75.7f";
        String numStrN2 = "71.2f";
        float numNotaPri = Float.parseFloat(numStrN1); //Primitivo
        Float numNotaObj = Float.valueOf(numStrN2);    //Objeto

        int numCompFloat = Float.compare(numNotaPri, numNotaObj.floatValue());

        strFormat = String.format("%.1f %s %.1f",
                numNotaPri,
                switch (numCompFloat) {
                    case 0:
                        yield "é IGUAL a";
                    case 1:
                        yield "é MAIOR do que";
                    default:
                        yield "é MENOR do que";
                },
                numNotaObj.floatValue());

        System.out.println("String Converte => " + strFormat);

        //String Builders
        StringBuilder fraseBuilder = new StringBuilder(10);
        fraseBuilder.append("Gil Palmeira");

        System.out.println("String Builder => Capacidade: " + fraseBuilder.capacity() +
                ", Tamanho: " + fraseBuilder.length());

        fraseBuilder.insert(fraseBuilder.lastIndexOf("P"), "Santos");
        fraseBuilder.delete(fraseBuilder.lastIndexOf("P"), fraseBuilder.length());

        System.out.println("String Builder => Nome Completo: " + fraseBuilder);

        //Autoboxing and Unboxing (Conversão)
        //Autoboxing -> Primitive Types => Object Wrapper Classes
        int diaAniversario = 15;
        Integer diaPremio = diaAniversario; //Integer.valueOf(diaAniversario)

        System.out.println("Autoboxing => Dia de Resgate do Prêmio: " + diaPremio);

        double saldoInicial = 15.89;
        Double saldoFinal = saldoInicial; //Double.valueOf(saldoInicial)

        System.out.println("Autoboxing => Saldo Final: " + saldoFinal);

        //Unboxing -> Object Wrapper Classes => Primitive Types
        Float percSalarial = Float.valueOf(25.00f);
        float percAumento = percSalarial; //percSalarial.floatValue()

        System.out.println("Unboxing => Percentual de Aumento: " + percAumento);

        Long timeMaxSeg = Long.valueOf(60);
        long timeMaxMin = timeMaxSeg; //timeMaxSeg.longValue()

        System.out.println("Unboxing => Minuto Máximo: " + timeMaxMin);

// PAREI NA...
// https://dev.java/learn/inheritance/what-is-inheritance/#intro

/* -- Reaproveitar quando chegar nos pontos abaixo
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
*/
    }
}