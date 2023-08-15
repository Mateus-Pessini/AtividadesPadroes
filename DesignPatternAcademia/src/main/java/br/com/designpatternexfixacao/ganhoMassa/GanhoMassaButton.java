package br.com.designpatternexfixacao.ganhoMassa;

import br.com.designpatternexfixacao.abstrasctFactory.Button;


public class GanhoMassaButton implements Button {

    @Override
    public void render() {
        System.out.println("Ganho de Massa Button");
    }
    
}
