package org.example;

public class Main {
    public static void main(String[] args) {
        EmissorDocumentoFiscal emissorNotaFiscal = new EmissorNota();
        emissorNotaFiscal.processarDocumento();

        EmissorDocumentoFiscal emissorCupomFiscal = new EmissorCupomFiscal();
        emissorCupomFiscal.processarDocumento();
    }
}