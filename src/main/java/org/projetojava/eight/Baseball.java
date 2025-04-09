package org.projetojava.eight;

import java.util.Random;

public interface Baseball {
    //Obs.: Somente UMA Lambda por Interface
    //Método abstrato (Lambda)
    public int getPontBatedor();

    public static int getPontoArremessador() {
        return getPonto();
    }

    public static int getPonto() {
        return new Random().nextInt(1, 20);
    }
}
