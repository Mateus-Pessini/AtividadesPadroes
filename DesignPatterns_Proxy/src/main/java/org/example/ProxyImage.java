package org.example;

public class ProxyImage implements Imagem {
    private RealImage imagemReal;
    private String nomeArquivo;

    public ProxyImage(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new RealImage(nomeArquivo);
        }
        imagemReal.exibir();
    }
}
