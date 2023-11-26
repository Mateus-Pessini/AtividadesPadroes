package org.example;

public class EmissorCupomFiscal extends EmissorDocumentoFiscal {
    @Override
    protected void salvarDocumento() {
        System.out.println("Cupom Fiscal salvo.");
    }

    @Override
    protected void inutilizarNumeracao() {
        System.out.println("Numeração do Cupom Fiscal inutilizada.");
    }
    @Override
    protected void transmitirDocumento() {
        System.out.println("Cupom Fiscal transmitido.");
    }
    @Override
    protected void consultarDocumento() {
        System.out.println("Cupom Fiscal consultado.");
    }
    @Override
    protected void cancelarDocumento() {
        System.out.println("Cupom Fiscal cancelado.");
    }

}
