/*
*           --- Space Shooter ---
*   A nave pode invocar o método atirar(), recebendo como parametro um asteróide
*   Existem dois tipos de asteróides: Pequeno e Grande
*   A nave possui dois tipos de tiro: Normal e Explosivo
*   Asteroides grandes podem ser destruidos apenas com tiro Explosivo
*   Se o asteroide for destruido, ele chama o metodo destruir(), mostrando uma mensagem
*
*/




package br.inatel.cdg;

import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    Nave rednave = new Nave("Nave Red", 100, "Normal");
    Nave green_nave = new Nave("Nave Green", 100, "Explosivo");

    Asteroide at1 = new Asteroide("Asteroide 01", "Pequeno");
    Asteroide at2 = new Asteroide("Asteroide 02", "Grande");



}
