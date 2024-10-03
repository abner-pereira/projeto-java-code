package org.projetojava.five;

public abstract class Constants {
    //Enum SIMPLES - SEM Corpo
    public enum MesesNum {
        //Semelhante a um ARRAY (posições/indíce de 0...N)
        JAN, FEV, MAR, ABR, MAI, JUN, JUL, AGO, SET, OUT, NOV, DEZ
    }

    public static void getMesDescr(MesesNum mes) {
        String mesDesc = switch (mes) {
            case MesesNum.JAN -> Meses.JAN.getDescrocao();
            case MesesNum.FEV -> Meses.FEV.getDescrocao();
            case MesesNum.MAR -> Meses.MAR.getDescrocao();
            case MesesNum.ABR -> Meses.ABR.getDescrocao();
            case MesesNum.MAI -> Meses.MAI.getDescrocao();
            case MesesNum.JUN -> Meses.JUN.getDescrocao();
            case MesesNum.JUL -> Meses.JUL.getDescrocao();
            case MesesNum.AGO -> Meses.AGO.getDescrocao();
            case MesesNum.SET -> Meses.SET.getDescrocao();
            case MesesNum.OUT -> Meses.OUT.getDescrocao();
            case MesesNum.NOV -> Meses.NOV.getDescrocao();
            case MesesNum.DEZ -> Meses.DEZ.getDescrocao();
        };

        System.out.println("ENUM => Mẽs informado: " + mesDesc);
    }
}
