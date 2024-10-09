package org.projetojava.five;

public abstract class Mes {
    //Enum SIMPLES - SEM Corpo
    public enum MesesNum {
        //Semelhante a um ARRAY (posições/indíce de 0...N)
        JAN, FEV, MAR, ABR, MAI, JUN, JUL, AGO, SET, OUT, NOV, DEZ
    }

    public static void getMesDescr(MesesNum mes) {
        String mesDesc = switch (mes) {
            case MesesNum.JAN -> Meses.JAN.getDescricao();
            case MesesNum.FEV -> Meses.FEV.getDescricao();
            case MesesNum.MAR -> Meses.MAR.getDescricao();
            case MesesNum.ABR -> Meses.ABR.getDescricao();
            case MesesNum.MAI -> Meses.MAI.getDescricao();
            case MesesNum.JUN -> Meses.JUN.getDescricao();
            case MesesNum.JUL -> Meses.JUL.getDescricao();
            case MesesNum.AGO -> Meses.AGO.getDescricao();
            case MesesNum.SET -> Meses.SET.getDescricao();
            case MesesNum.OUT -> Meses.OUT.getDescricao();
            case MesesNum.NOV -> Meses.NOV.getDescricao();
            case MesesNum.DEZ -> Meses.DEZ.getDescricao();
        };

        System.out.println("Mẽs Descritivo => Mẽs informado: " + mesDesc);
    }
}
