
package br.com.designpatternexfixacao.comecoZero;

import br.com.designpatternexfixacao.abstrasctFactory.Button;

public class comecoZeroButton implements Button{

    @Override
    public void render() {
        System.out.println("Começo do Zero Button!");
    }
    
}
