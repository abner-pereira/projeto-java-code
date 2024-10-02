package org.projetojava.five;

public class Nested {
    private int nivel = 0;

    //Classe Concreta -> COM Acesso aos FIELDS privados
    class NivelOne {
        void getNivel() {
            nivel++;
            System.out.println("Nivel atual => Classe Aninhada Concreto: " + nivel);
        }
    }

    //Classe Static -> SEM Acesso aos FIELDS privados
    static class NivelStaticOne {
        void getNivel(Nested nested) {
            nested.nivel++;
            System.out.println("Nivel atual => Classe Aninhada Estático: " + nested.nivel);
        }
    }

    public void showNivel() {
        new NivelOne().getNivel();
    }

    public void showNivelStatic() {
        new NivelStaticOne().getNivel(this);
    }

    //Interface
    interface Nivel {
        void getNivel();

        void addNivel();
    }

    public void showNivelLocal() {
        //Classe Local -> COM Acesso aos FIELDS privados
        class Contador implements Nivel {
            @Override
            public void getNivel() {
                System.out.println("Nivel atual => Classe Local: " + nivel);
            }

            @Override
            public void addNivel() {
                nivel++;
            }
        }

        Contador cont = new Contador();
        cont.addNivel();
        cont.getNivel();
    }

    public void showNivelAnonimo() {
        //Classe Anônima -> COM Acesso aos FIELDS privados
        Nivel anonimo = new Nivel() {
            @Override
            public void getNivel() {
                nivel++;
            }

            @Override
            public void addNivel() {
                System.out.println("Nivel atual => Classe Anônima: " + nivel);
            }
        };

        anonimo.addNivel();
        anonimo.getNivel();
    }
}