package org.example;

public class RealImage implements Imagem{
    private String nomeArquivo;

    public RealImage(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarImagemDoDisco();
    }

    private void carregarImagemDoDisco() {
        System.out.println("Carregando imagem " + nomeArquivo);
    }

    public void exibir() {
        System.out.println("Exibindo imagem " + nomeArquivo +"\n");
    }
}
