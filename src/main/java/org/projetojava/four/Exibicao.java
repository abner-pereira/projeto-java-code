package org.projetojava.four;

/*
*** Visibilidade:
** At the top level:
+ public
+ package-private (no explicit modifier)

** At the member level:
+ public
+ protected
+ package-private (no explicit modifier)
+ private

+1 -> Podem ser usados em Classes, Interfaces, Métodos e Atributos
+2 -> package-private -> Visibilidade somente dentro do Pacote
*/

interface Exibicao {
    public String showDado();
}