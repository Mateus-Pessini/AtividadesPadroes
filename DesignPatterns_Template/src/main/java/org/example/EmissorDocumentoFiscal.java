package org.example;

abstract class EmissorDocumentoFiscal {

    // Template Method
    public final void processarDocumento() {
        salvarDocumento();
        transmitirDocumento();
        consultarDocumento();
        cancelarDocumento();
        inutilizarNumeracao();
    }


    protected void salvarDocumento() {

        System.out.println("Documento salvo.");
    }

    protected void transmitirDocumento() {

        System.out.println("Documento transmitido.");
    }

    protected void consultarDocumento() {

        System.out.println("Documento consultado.");
    }

    protected void cancelarDocumento() {

        System.out.println("Documento cancelado.");
    }

    protected void inutilizarNumeracao() {

        System.out.println("Numeração inutilizada. \n");
    }

}
