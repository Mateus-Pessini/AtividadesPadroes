package org.example;

public class EmissorNota extends EmissorDocumentoFiscal{

    @Override
    protected void salvarDocumento() {
        // Lógica específica para salvar Nota Fiscal
        System.out.println("Nota Fiscal salva.");
    }

    @Override
    protected void transmitirDocumento() {
        // Lógica específica para transmitir Nota Fiscal
        System.out.println("Nota Fiscal transmitida.");
    }

    @Override
    protected void inutilizarNumeracao() {
        System.out.println("Numeração da Nota Fiscal inutilizada. \n");
    }
    @Override
    protected void consultarDocumento() {
        System.out.println("Nota Fiscal consultada.");
    }
    @Override
    protected void cancelarDocumento() {
        System.out.println("Nota Fiscal cancelada.");
    }
}
