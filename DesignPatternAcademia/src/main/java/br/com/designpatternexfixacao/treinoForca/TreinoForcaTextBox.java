
package br.com.designpatternexfixacao.treinoForca;

import br.com.designpatternexfixacao.abstrasctFactory.TextBox;


public class TreinoForcaTextBox implements TextBox {

    @Override
    public void render() {
        System.out.println("Treino de Força TextBox");
    }
    
}
